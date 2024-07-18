# Copyright (C) 2008-2009 John Millikin <jmillikin@gmail.com>
# 
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
# 
# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.
# 
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
# THE SOFTWARE.

# Imports {{{
import array
import codecs
import collections
from decimal import Decimal
import unittest
import io

from jsonlib import read, write, ReadError, WriteError, UnknownSerializerError
import jsonlib
# }}}

# Support & Utility definitions {{{
try:
	INFINITY = float ('inf')
except ValueError:
	INFINITY = 1e300000
try:
	NAN = float ('nan')
except ValueError:
	NAN = INFINITY/INFINITY
	
class ContinuableTestCase (unittest.TestCase):
	def run (self, result = None):
		if result is None:
			result = self.defaultTestResult ()
		self._result = result
		return super (ContinuableTestCase, self).run (result)
		
def allow_test_continue (func):
	def new_func (self, *args, **kwargs):
		return func (self, *args, **kwargs)
		try:
			return func (self, *args, **kwargs)
		except self.failureException:
			self._result.addFailure (self, self._exc_info ())
	for attr in ('__module__', '__name__', '__doc__'):
		setattr (new_func, attr, getattr (func, attr))
	new_func.__dict__.update (func.__dict__)
	return new_func
	
class ParserTestCase (ContinuableTestCase):
	@allow_test_continue
	def r (self, string, expected, **kwargs):
		value = read (string, **kwargs)
		self.assertEqual (value, expected)
		self.assertEqual (type (value), type (expected))
		
	@allow_test_continue
	def re (self, string, line, column, position, expected_error_message):
		full_expected = ("JSON parsing error at line %d, column %d"
		                 " (position %d): %s" % (line, column,
		                                         position,
		                                         expected_error_message))
		error_str = None
		try:
			read (string)
		except ReadError as error:
			error_str = str (error)
		else:
			self.fail ("No exception raised.")
		self.assertEqual (error_str, full_expected)
		
class SerializerTestCase (ContinuableTestCase):
	@allow_test_continue
	def w (self, value, expected, **kwargs):
		serialized = write (value, encoding = None, **kwargs)
		self.assertEqual (serialized, expected)
		self.assertEqual (type (serialized), type (expected))
		
	@allow_test_continue
	def we (self, value, expected_error_message, error_type = None, **kwargs):
		if error_type is None:
			error_type = WriteError
		error_str = None
		try:
			write (value, **kwargs)
		except error_type as error:
			error_str = str (error)
		else:
			self.fail ("No exception raised.")
		self.assertEqual (error_str, expected_error_message)
		
def _load_tests (base_class):
	loader = unittest.TestLoader ()
	suite = unittest.TestSuite ()
	from_local = loader.loadTestsFromTestCase
	for name, value in globals ().items ():
		if (isinstance (value, type) and
		    issubclass (value, base_class)):
			suite.addTests (from_local (value))
	return suite
	
def parser ():
	return _load_tests (ParserTestCase)
	
def serializer ():
	return _load_tests (SerializerTestCase)
	
def suite ():
	return _load_tests (unittest.TestCase)
	
# }}}

# Tests for the parser {{{
class ReadMiscTests (ParserTestCase):
	def test_fail_on_empty (self):
		self.re ('', 1, 1, 0, "No expression found.")
		self.re (' ', 1, 1, 0, "No expression found.")
		
	def test_fail_on_invalid_whitespace (self):
		self.re ('[\u000C]', 1, 2, 1, "Unexpected U+000C.")
		self.re ('[\u000E]', 1, 2, 1, "Unexpected U+000E.")
		self.re ('[\u00A0]', 1, 2, 1, "Unexpected U+00A0.")
		self.re ('[\u2002]', 1, 2, 1, "Unexpected U+2002.")
		self.re ('[\u2028]', 1, 2, 1, "Unexpected U+2028.")
		self.re ('[\u2029]', 1, 2, 1, "Unexpected U+2029.")
		
	def test_with_two_lines (self):
		self.re ('\n[\u000B]', 2, 2, 2, "Unexpected U+000B.")
		
	def test_unexpected_character (self):
		self.re ('[+]', 1, 2, 1, "Unexpected U+002B.")
		
	def test_unexpected_character_astral (self):
		self.re ('[\U0001d11e]', 1, 2, 1, "Unexpected U+0001D11E.")
		
	def test_no_unwrapped_values (self):
		self.re ('1', 1, 1, 0, "Unexpected U+0031.")
		
	def test_parse_atom_before_unwrapped_check (self):
		self.re ('n', 1, 1, 0, "Unexpected U+006E.")
		
	def test_loads_alias (self):
		self.assert_ (jsonlib.read is jsonlib.loads)
		
class ReadExtraDataTests (ParserTestCase):
	def test_array_start (self):
		self.re ('[][', 1, 3, 2, "Extra data after JSON expression.")
		
	def test_array_end (self):
		self.re ('[]]', 1, 3, 2, "Extra data after JSON expression.")
		
	def test_object_start (self):
		self.re ('[]{', 1, 3, 2, "Extra data after JSON expression.")
		
	def test_object_end (self):
		self.re ('[]}', 1, 3, 2, "Extra data after JSON expression.")
		
	def test_atom (self):
		self.re ('[]1', 1, 3, 2, "Extra data after JSON expression.")
		
	def test_comma (self):
		self.re ('[],', 1, 3, 2, "Extra data after JSON expression.")
		
	def test_colon (self):
		self.re ('[]:', 1, 3, 2, "Extra data after JSON expression.")
		
	def test_other (self):
		self.re ('[]+', 1, 3, 2, "Extra data after JSON expression.")
		
	def test_array_whitespace (self):
		self.r ('[] ', [])
		
	def test_object_whitespace (self):
		self.r ('{} ', {})
		
class ReadUnexpectedTests (ParserTestCase):
	def test_array_end (self):
		self.re (']', 1, 1, 0, "Unexpected U+005D.")
		
	def test_object_end (self):
		self.re ('}', 1, 1, 0, "Unexpected U+007D.")
		
	def test_comma (self):
		self.re (',', 1, 1, 0, "Unexpected U+002C.")
		
	def test_colon (self):
		self.re (':', 1, 1, 0, "Unexpected U+003A.")
		
	def test_other (self):
		self.re ('+', 1, 1, 0, "Unexpected U+002B.")
		
class ReadKeywordTests (ParserTestCase):
	def test_null (self):
		self.r ('[null]', [None])
		
	def test_true (self):
		self.r ('[true]', [True])
		
	def test_false (self):
		self.r ('[false]', [False])
		
	def test_invalid_keyword (self):
		self.re ('[n]', 1, 2, 1, "Unexpected U+006E.")
		self.re ('[t]', 1, 2, 1, "Unexpected U+0074.")
		self.re ('[f]', 1, 2, 1, "Unexpected U+0066.")
		
class ReadNumberTests (ParserTestCase):
	def test_zero (self):
		self.r ('[0]', [0])
		
	def test_negative_zero (self):
		self.r ('[-0]', [0])
		
	def test_two_zeroes_error (self):
		self.re ('[00]', 1, 2, 1, "Invalid number.")
		self.re ('[01]', 1, 2, 1, "Invalid number.")
		self.re ('[00.1]', 1, 2, 1, "Invalid number.")
		
	def test_negative_two_zeroes_error (self):
		self.re ('[-00]', 1, 2, 1, "Invalid number.")
		self.re ('[-01]', 1, 2, 1, "Invalid number.")
		self.re ('[-00.1]', 1, 2, 1, "Invalid number.")
		
	def test_int (self):
		for ii in range (10):
			self.r ('[%d]' % ii, [ii])
			self.r ('[-%d]' % ii, [-ii])
			
	def test_decimal (self):
		self.r ('[1.2345]', [Decimal ('1.2345')])
		
	def test_negative_decimal (self):
		self.r ('[-1.2345]', [Decimal ('-1.2345')])
		
	def test_zero_after_decimal (self):
		self.r ('[0.01]', [Decimal ('0.01')])
		
	def test_exponent (self):
		self.r ('[1e2]', [Decimal ('100.0')])
		self.r ('[10e2]', [Decimal ('1000.0')])
		
	def test_capital_exponent (self):
		self.r ('[1E2]', [Decimal ('100.0')])
		
	def test_exponent_plus (self):
		self.r ('[1e+2]', [Decimal ('100.0')])
		self.r ('[10e+2]', [Decimal ('1000.0')])
		
	def test_negative_exponent (self):
		self.r ('[1e-2]', [Decimal ('0.01')])
		self.r ('[10e-2]', [Decimal ('0.1')])
		
	def test_decimal_exponent (self):
		self.r ('[10.5e2]', [Decimal ('1050.0')])
		
	def test_negative_decimal_exponent (self):
		self.r ('[10.5e-2]', [Decimal ('0.105')])
		
	def test_preserve_negative_decimal_zero (self):
		# Don't use self.r, because Decimal ('0.0') == Decimal ('-0.0')
		value = read ('[0.0]')
		self.assertEqual (len (value), 1)
		self.assertEqual (type (value[0]), Decimal)
		self.assertEqual (repr (value[0]), repr (Decimal("0.0")))
		
		value = read ('[-0.0]')
		self.assertEqual (len (value), 1)
		self.assertEqual (type (value[0]), Decimal)
		self.assertEqual (repr (value[0]), repr (Decimal("-0.0")))
		
	def test_decimal_fp (self):
		self.r ('[1.2345]', [1.2345], use_float = True)
		
	def test_negative_decimal_fp (self):
		self.r ('[-1.2345]', [-1.2345], use_float = True)
		
	def test_zero_after_decimal_fp (self):
		self.r ('[0.01]', [0.01], use_float = True)
		
	def test_exponent_fp (self):
		self.r ('[1e2]', [100.0], use_float = True)
		self.r ('[10e2]', [1000.0], use_float = True)
		
	def test_capital_exponent_fp (self):
		self.r ('[1E2]', [100.0], use_float = True)
		
	def test_exponent_plus_fp (self):
		self.r ('[1e+2]', [100.0], use_float = True)
		self.r ('[10e+2]', [1000.0], use_float = True)
		
	def test_negative_exponent_fp (self):
		self.r ('[1e-2]', [0.01], use_float = True)
		self.r ('[10e-2]', [0.1], use_float = True)
		
	def test_decimal_exponent_fp (self):
		self.r ('[10.5e2]', [1050.0], use_float = True)
		
	def test_negative_decimal_exponent_fp (self):
		self.r ('[10.5e-2]', [0.105], use_float = True)
		
	def test_preserve_negative_decimal_zero_fp (self):
		# Don't use self.r, because 0.0 == -0.0
		value = read ('[0.0]', use_float = True)
		self.assertEqual (len (value), 1)
		self.assertEqual (type (value[0]), float)
		self.assertEqual (repr (value[0]), repr (0.0))
		
		value = read ('[-0.0]', use_float = True)
		self.assertEqual (len (value), 1)
		self.assertEqual (type (value[0]), float)
		self.assertEqual (repr (value[0]), repr (-0.0))
		
	def test_invalid_number (self):
		self.re ('[-.]', 1, 2, 1, "Invalid number.")
	
	def test_invalid_number_2 (self):
		self.re ('[0.]', 1, 2, 1, "Invalid number.")
		
	def test_no_plus_sign (self):
		self.re ('[+1]', 1, 2, 1, "Unexpected U+002B.")
		
	def test_non_ascii_number (self):
		self.re ('[\u0661]', 1, 2, 1, "Unexpected U+0661.")
		
class ReadStringTests (ParserTestCase):
	def test_empty_string (self):
		self.r ('[""]', [''])
		
	def test_basic_string (self):
		self.r ('["test"]', ['test'])
		
	def test_unescape_quote (self):
		self.r ('["\\""]', ['"'])
		
	def test_unescape_reverse_solidus (self):
		self.r ('["\\\\"]', ['\\'])
		
	def test_unescape_solidus (self):
		self.r ('["\\/"]', ['/'])
		
	def test_unescape_backspace (self):
		self.r ('["\\b"]', ['\b'])
		
	def test_unescape_form_feed (self):
		self.r ('["\\f"]', ['\f'])
		
	def test_unescape_line_feed (self):
		self.r ('["\\n"]', ['\n'])
		
	def test_unescape_carriage_return (self):
		self.r ('["\\r"]', ['\r'])
		
	def test_unescape_tab (self):
		self.r ('["\\t"]', ['\t'])
		
	def test_string_with_whitespace (self):
		self.r ('[" \\" "]', [" \" "])
		
	def test_unescape_single_unicode (self):
		self.r ('["\\u005C"]', ['\\'])
		self.r ('["\\u005c"]', ['\\'])
		
	def test_unescape_double_unicode (self):
		self.r ('["\\uD834\\uDD1E"]', ['\U0001d11e'])
		self.r ('["\\ud834\\udd1e"]', ['\U0001d11e'])
		
	def test_unescape_unicode_followed_by_normal (self):
		self.r ('["\\u00e9a"]', ['\u00e9a'])
		
	def test_end_of_stream (self):
		self.re ('["test\\u"]', 1, 7, 6,
		        "Unterminated unicode escape.")
		
	def test_missing_surrogate (self):
		self.re ('["\\uD834"]', 1, 9, 8,
		        "Missing surrogate pair half.")
		self.re ('["\\uD834\\u"]', 1, 9, 8,
		        "Missing surrogate pair half.")
		self.re ('["\\uD834\\u", "hello world"]', 1, 9, 8,
		        "Missing surrogate pair half.")
		self.re ('["\\uD834testing"]', 1, 9, 8,
		        "Missing surrogate pair half.")
		
	def test_invalid_codepoint (self):
		self.re ('["\\uDD1E"]', 1, 3, 2,
		        "U+DD1E is a reserved code point.")
		
	def test_invalid_escape (self):
		self.re ('["\\a"]', 1, 3, 2, "Unknown escape code: \\a.")
		
	def test_direct_unicode (self):
		self.r ('["\U0001d11e"]', ['\U0001d11e'])
		
	def test_bmp_unicode (self):
		self.r ('["\u24CA"]'.encode ('utf-8'), ['\u24CA'])
		
	def test_astral_unicode (self):
		self.r ('["\U0001d11e"]'.encode ('utf-8'), ['\U0001d11e'])
		
	def test_invalid_characters (self):
		for ordinal in range (0x01, 0x20):
			ustring = '["' + chr (ordinal) + '"]'
			self.re (ustring, 1, 3, 2, "Unexpected U+%04X." % ordinal)
			
	def test_error_reporting_after_unicode_escape (self):
		self.re ('["\\u0020\\v"]', 1, 9, 8, "Unknown escape code: \\v.")
		
	def test_error_unterminated (self):
		self.re ('["', 1, 2, 1, "Unterminated string.")
		
class ReadArrayTests (ParserTestCase):
	def test_empty_array (self):
		self.r ('[]', [])
		
	def test_ignore_whitespace (self):
		self.r ('[ 1 , 2 , 3 ]', [1, 2, 3])
		
	def test_integer_array (self):
		self.r ('[1, 2, 3]', [1, 2, 3])
		
	def test_string_array (self):
		self.r ('["a", "b", "c"]', ["a", "b", "c"])
		
	def test_nested_arrays (self):
		self.r ('[[], [1], [2, [3]]]', [[], [1], [2, [3]]])
		
	def test_mixed_array (self):
		self.r ('[1, "b", ["c", "d"]]', [1, "b", ["c", "d"]])
		
	def test_failure_missing_comma (self):
		self.re ('[1 2]', 1, 4, 3, "Unexpected U+0032 while looking for comma.")
		
	def test_error_unterminated_array (self):
		self.re ('[1, 2, 3, [', 1, 11, 10, "Unterminated array.")
		
	def test_error_unterminated_array_with_value (self):
		self.re ('[1', 1, 1, 0, "Unterminated array.")
		
	def test_error_unterminated_array_expecting_value (self):
		self.re ('[1,', 1, 1, 0, "Unterminated array.")
		
	def test_unexpected_array_start (self):
		self.re ('[1[',  1, 3, 2, "Unexpected U+005B while looking for comma.")
		
	def test_unexpected_array_end (self):
		self.re ('[1,]', 1, 4, 3, "Unexpected U+005D.")
		
	def test_unexpected_object_start (self):
		self.re ('[1{',  1, 3, 2, "Unexpected U+007B while looking for comma.")
		
	def test_unexpected_object_end (self):
		self.re ('[}',   1, 2, 1, "Unexpected U+007D.")
		self.re ('[1}',  1, 3, 2, "Unexpected U+007D while looking for comma.")
		self.re ('[1,}', 1, 4, 3, "Unexpected U+007D.")
		
	def test_unexpected_comma (self):
		self.re ('[,',   1, 2, 1, "Unexpected U+002C.")
		self.re ('[1,,', 1, 4, 3, "Unexpected U+002C.")
		
	def test_unexpected_colon (self):
		self.re ('[:',   1, 2, 1, "Unexpected U+003A.")
		self.re ('[1:',  1, 3, 2, "Unexpected U+003A while looking for comma.")
		self.re ('[1,:', 1, 4, 3, "Unexpected U+003A.")
		
class ReadObjectTests (ParserTestCase):
	def test_empty_object (self):
		self.r ('{}', {})
		
	def test_ignore_whitespace (self):
		self.r ('{ "a" : true }', {"a": True})
		
	def test_integer_object (self):
		self.r ('{"a": 1, "b": 2}', {"a": 1, "b": 2})
		
	def test_string_object (self):
		self.r ('{"a": "first", "b": "second"}',
		        {"a": "first", "b": "second"})
		
	def test_nested_objects (self):
		self.r ('{"a": 1, "b": {"c": "2"}}',
		        {"a": 1, "b": {"c": "2"}})
		
	def test_empty_key (self):
		self.r ('{"": 1}', {"": 1})
		
	def test_failure_no_colon (self):
		self.re ('{"a"}', 1, 5, 4, "Unexpected U+007D while looking for colon.")
		
	def test_failure_invalid_key (self):
		self.re ('{1: 2}', 1, 2, 1, "Unexpected U+0031 while looking for property name.")
		self.re ('{"a": 1,}', 1, 9, 8, "Unexpected U+007D while looking for property name.")
		self.re ('{,}', 1, 2, 1, "Unexpected U+002C while looking for property name.")
		
	def test_failure_missing_comma (self):
		self.re ('{"a": 1 "b": 2}', 1, 9, 8, "Unexpected U+0022 while looking for comma.")
		
	def test_failure_trailing_newline (self):
		self.re ('{"a": "b",\n}\n', 2, 1, 11, "Unexpected U+007D while looking for property name.")
		
	def test_unterminated (self):
		self.re ('{',       1, 1, 0, "Unterminated object.")
		self.re ('{"a"',    1, 1, 0, "Unterminated object.")
		self.re ('{"a":',   1, 1, 0, "Unterminated object.")
		self.re ('{"a":1',  1, 1, 0, "Unterminated object.")
		self.re ('{"a":1,', 1, 1, 0, "Unterminated object.")
		
	def test_unexpected_atom (self):
		self.re ('{"a"1', 1, 5, 4, "Unexpected U+0031 while looking for colon.")
		
	def test_unexpected_array_start (self):
		self.re ('{[',       1, 2, 1, "Unexpected U+005B while looking for property name.")
		self.re ('{"a"[',    1, 5, 4, "Unexpected U+005B while looking for colon.")
		self.re ('{"a":1[',  1, 7, 6, "Unexpected U+005B while looking for comma.")
		self.re ('{"a":1,[', 1, 8, 7, "Unexpected U+005B while looking for property name.")
		
	def test_unexpected_array_end (self):
		self.re ('{]',       1, 2, 1, "Unexpected U+005D while looking for property name.")
		self.re ('{"a"]',    1, 5, 4, "Unexpected U+005D while looking for colon.")
		self.re ('{"a":]',   1, 6, 5, "Unexpected U+005D.")
		self.re ('{"a":1]',  1, 7, 6, "Unexpected U+005D while looking for comma.")
		self.re ('{"a":1,]', 1, 8, 7, "Unexpected U+005D while looking for property name.")
		
	def test_unexpected_object_start (self):
		self.re ('{{',       1, 2, 1, "Unexpected U+007B while looking for property name.")
		self.re ('{"a"{',    1, 5, 4, "Unexpected U+007B while looking for colon.")
		self.re ('{"a":1{',  1, 7, 6, "Unexpected U+007B while looking for comma.")
		self.re ('{"a":1,{', 1, 8, 7, "Unexpected U+007B while looking for property name.")
		
	def test_unexpected_object_end (self):
		self.re ('{"a":}', 1, 6, 5, "Unexpected U+007D.")
		
	def test_unexpected_comma (self):
		self.re ('{"a",}',    1, 5, 4, "Unexpected U+002C while looking for colon.")
		self.re ('{"a":,}',   1, 6, 5, "Unexpected U+002C.")
		self.re ('{"a":1,,}', 1, 8, 7, "Unexpected U+002C while looking for property name.")
		
	def test_unexpected_colon (self):
		self.re ('{:',        1, 2, 1, "Unexpected U+003A while looking for property name.")
		self.re ('{"a"::}',   1, 6, 5, "Unexpected U+003A.")
		self.re ('{"a":1:}',  1, 7, 6, "Unexpected U+003A while looking for comma.")
		self.re ('{"a":1,:}', 1, 8, 7, "Unexpected U+003A while looking for property name.")
		
class UnicodeEncodingDetectionTests (ParserTestCase):
	def de (self, encoding, bom = b''):
		def read_encoded (string, expected):
			self.r (bom + string.encode (encoding), expected)
			
		# Test various string lengths
		read_encoded ('[]', [])
		read_encoded ('[1]', [1])
		read_encoded ('[12]', [12])
		read_encoded ('[123]', [123])
		read_encoded ('[1234]', [1234])
		read_encoded ('[12345]', [12345])
		
	def test_utf32_be (self):
		# '["testing"]'
		s = (b'\x00\x00\x00['
		     b'\x00\x00\x00"'
		     b'\x00\x00\x00t'
		     b'\x00\x00\x00e'
		     b'\x00\x00\x00s'
		     b'\x00\x00\x00t'
		     b'\x00\x00\x00i'
		     b'\x00\x00\x00n'
		     b'\x00\x00\x00g'
		     b'\x00\x00\x00"'
		     b'\x00\x00\x00]')
		self.r (s, ['testing'])
		
	def test_utf32_be_bom (self):
		# '["testing"]'
		s = (b'\x00\x00\xfe\xff'
		     b'\x00\x00\x00['
		     b'\x00\x00\x00"'
		     b'\x00\x00\x00t'
		     b'\x00\x00\x00e'
		     b'\x00\x00\x00s'
		     b'\x00\x00\x00t'
		     b'\x00\x00\x00i'
		     b'\x00\x00\x00n'
		     b'\x00\x00\x00g'
		     b'\x00\x00\x00"'
		     b'\x00\x00\x00]')
		self.r (s, ['testing'])
		
	def test_utf32_le (self):
		# '["testing"]'
		s = (b'[\x00\x00\x00'
		     b'"\x00\x00\x00'
		     b't\x00\x00\x00'
		     b'e\x00\x00\x00'
		     b's\x00\x00\x00'
		     b't\x00\x00\x00'
		     b'i\x00\x00\x00'
		     b'n\x00\x00\x00'
		     b'g\x00\x00\x00'
		     b'"\x00\x00\x00'
		     b']\x00\x00\x00')
		self.r (s, ['testing'])
		
	def test_utf32_le_bom (self):
		# '["testing"]'
		s = (b'\xff\xfe\x00\x00'
		     b'[\x00\x00\x00'
		     b'"\x00\x00\x00'
		     b't\x00\x00\x00'
		     b'e\x00\x00\x00'
		     b's\x00\x00\x00'
		     b't\x00\x00\x00'
		     b'i\x00\x00\x00'
		     b'n\x00\x00\x00'
		     b'g\x00\x00\x00'
		     b'"\x00\x00\x00'
		     b']\x00\x00\x00')
		self.r (s, ['testing'])
		
	def test_utf32_be_astral (self):
		s = (b'\x00\x00\x00['
		     b'\x00\x00\x00"'
		     b'\x00\x01\xd1\x1e'
		     b'\x00\x00\x00"'
		     b'\x00\x00\x00]')
		self.r (s, ['\U0001d11e'])
		
	def test_utf32_le_astral (self):
		s = (b'[\x00\x00\x00'
		     b'"\x00\x00\x00'
		     b'\x1e\xd1\x01\x00'
		     b'"\x00\x00\x00'
		     b']\x00\x00\x00')
		self.r (s, ['\U0001d11e'])
		
	def test_utf16_be (self):
		self.de ('utf-16-be')
		
	def test_utf16_be_bom (self):
		self.de ('utf-16-be', b'\xfe\xff')
		
	def test_utf16_le (self):
		self.de ('utf-16-le')
		
	def test_utf16_le_bom (self):
		self.de ('utf-16-le', b'\xff\xfe')
		
	def test_utf8 (self):
		self.de ('utf-8')
		
	def test_utf8_sig (self):
		self.r (b'\xef\xbb\xbf["testing"]', ['testing'])
		
# }}}

# Tests for the serializer {{{
class WriteMiscTests (SerializerTestCase):
	class UnknownObject (object):
		def __str__ (self):
			return 'str (%s)' % (object.__repr__ (self))
		def __unicode__ (self):
			return 'unicode (%s)' % (object.__repr__ (self))
		def __repr__ (self):
			return 'repr (%s)' % (object.__repr__ (self))
			
	def test_fail_on_unknown (self):
		obj = self.UnknownObject ()
		self.we ([obj], "No known serializer for object: %r" % obj)
		
	def test_fail_on_unwrapped_atom (self):
		self.we (1, "The outermost container must be an array or object.")
		self.we ("1", "The outermost container must be an array or object.")
		
	def test_whitespace_indent (self):
		self.w ([], '[\n]', indent = '\u0020\u0009\u000A\u000D')
		
	def test_fail_on_non_whitespace_indent (self):
		self.we ([], "Only whitespace may be used for indentation.",
		         indent = 'bad', error_type = TypeError)
		
	def test_fail_on_other_whitespace_indent (self):
		# Whitespace that is not valid JSON whitespace
		self.we ([], "Only whitespace may be used for indentation.",
		         indent = '\u000B', error_type = TypeError)
		
		self.we ([], "Only whitespace may be used for indentation.",
		         indent = '\x00\u000B', error_type = TypeError)
		
	def test_fail_nonstring_indent (self):
		self.we ([], "Only whitespace may be used for indentation.",
		         indent = 1, error_type = TypeError)
		
	def test_on_unknown (self):
		def on_unknown (value, unknown):
			return repr (value)
		obj = object ()
		self.w ([obj], '["%r"]' % obj, on_unknown = on_unknown)
		
	def test_on_unknown_invalid (self):
		obj = self.UnknownObject ()
		self.we ([obj], "No known serializer for object: %r" % obj,
		         on_unknown = lambda v, u: v)
		
	def test_on_unknown_not_callable (self):
		obj = object ()
		self.we ([obj], "The on_unknown object must be callable.",
		         error_type = TypeError, on_unknown = obj)
		
	def test_int_subclass (self):
		class MyInt (int):
			pass
		self.w ([MyInt (10)], '[10]')
		
	def test_dumps_alias (self):
		self.assert_ (jsonlib.write is jsonlib.dumps)
		
	def test_fixed_truncation_error (self):
		data = [{"a": 3}] * 270
		
		fp = io.StringIO ()
		jsonlib.dump (data, fp, encoding = None)
		self.assertEqual (len (read (fp.getvalue ())), len (data))
		
		self.assertEqual (len (read (write (data))), len (data))
		
class WriteKeywordTests (SerializerTestCase):
	def test_null (self):
		self.w ([None], '[null]')
		
	def test_true (self):
		self.w ([True], '[true]')
		
	def test_false (self):
		self.w ([False], '[false]')
		
class WriteNumberTests (SerializerTestCase):
	def test_int (self):
		self.w ([1], '[1]')
		
	def test_long (self):
		self.w ([1], '[1]')
		
	def test_decimal (self):
		self.w ([Decimal ('1.1')], '[1.1]')
		
	def test_long_float (self):
		# Value that will give different string representations
		# depending on whether it is passed to str() or repr().
		pi = 3.1415926535897931
		self.assertNotEqual (str (pi), repr (pi))
		self.w ([pi], '[%s]' % repr (pi))
		
	def test_long_decimal (self):
		pi = Decimal ('3.1415926535897931')
		self.w ([pi], '[3.1415926535897931]')
		
	if repr (-0.0) != repr (0.0):
		def test_negative_zero (self):
			self.w ([-0.0], '[-0.0]')
			
	def test_negative_zero_decimal (self):
		self.w ([Decimal ('-0.0')], '[-0.0]')
		
	def test_complex (self):
		self.w ([5+0j], '[5.0]')
		self.w ([5.5+0j], '[5.5]')
		
	def test_long_complex (self):	
		pi = 3.1415926535897931
		self.assertNotEqual (str (pi), repr (pi))
		self.w ([pi+0j], '[%s]' % repr (pi))
		
	def test_fail_complex (self):
		self.we ([5+1j], "Cannot serialize complex numbers"
		                 " with imaginary components.")
		
	def test_fail_on_infinity (self):
		self.we ([INFINITY], "Cannot serialize Infinity.")
		
	def test_fail_on_neg_infinity (self):
		self.we ([-INFINITY], "Cannot serialize -Infinity.")
		
	def test_fail_on_nan (self):
		self.we ([NAN], "Cannot serialize NaN.")
		
	def test_fail_on_decimal_infinity (self):
		self.we ([Decimal ('Infinity')], "Cannot serialize Infinity.")
		
	def test_fail_on_decimal_neg_infiity (self):
		self.we ([Decimal ('-Infinity')], "Cannot serialize -Infinity.")
		
	def test_fail_on_decimal_nan (self):
		self.we ([Decimal ('NaN')], "Cannot serialize NaN.")
		
class WriteArrayTests (SerializerTestCase):
	def test_empty_array (self):
		self.w ([], '[]')
		
	def test_single_value_array (self):
		self.w ([True], '[true]')
		
	def test_multiple_value_array (self):
		self.w ([True, True], '[true,true]')
		
	def test_indent_empty (self):
		self.w ([], '[\n]', indent = '')
		
	def test_empty_indent (self):
		self.w ([True, True], '[\ntrue,\ntrue\n]', indent = '')
		
	def test_single_indent (self):
		self.w ([True, True], '[\n\ttrue,\n\ttrue\n]', indent = '\t')
		
	def test_nested_indent (self):
		self.w ([True, [True]], '[\n\ttrue,\n\t[\n\t\ttrue\n\t]\n]',
		        indent = '\t')
		
	def test_generator (self):
		self.w ((_ for _ in (True, True)), '[true,true]')
		
	def test_set (self):
		self.w (set (('a', 'b')), '["a","b"]')
		
	def test_frozenset (self):
		self.w (frozenset (('a', 'b')), '["a","b"]')
		
	def test_array (self):
		self.w (array.array('i', [1,2,3]), '[1,2,3]')
		
	def test_deque (self):
		self.w (collections.deque ((1, 2, 3)), '[1,2,3]')
		
	def test_fail_on_self_reference (self):
		a = []
		a.append (a)
		self.we (a, "Cannot serialize self-referential values.")
		
class WriteObjectTests (SerializerTestCase):
	def test_empty_object (self):
		self.w ({}, '{}')
		
	def test_single_value_object (self):
		self.w ({'a': True}, '{"a":true}')
		
	def test_multiple_value_object (self):
		self.w ({'a': True, 'b': True}, '{"a":true,"b":true}')
		
	def test_sort_keys (self):
		self.w ({'e': True, 'm': True}, '{"e":true,"m":true}',
		        sort_keys = True)
		
	def test_indent_empty (self):
		self.w ({}, '{\n}', indent = '')
		
	def test_empty_indent (self):
		self.w ({'a': True, 'b': True}, '{\n"a": true,\n"b": true\n}',
		        sort_keys = True, indent = '')
		
	def test_single_indent (self):
		self.w ({'a': True, 'b': True}, '{\n\t"a": true,\n\t"b": true\n}',
		        sort_keys = True, indent = '\t')
		
	def test_nested_indent (self):
		self.w ({'a': True, 'b': {'c': True}},
		        '{\n\t"a": true,\n\t"b": {\n\t\t"c": true\n\t}\n}',
		        sort_keys = True, indent = '\t')
		
	def test_fail_on_invalid_key (self):
		self.we ({1: True}, "Only strings may be used as object keys.")
		
	def test_coerce_invalid_key (self):
		self.w ({1: True}, '{"1":true}', coerce_keys = True)
		self.w ({True: 1}, '{"True":1}', coerce_keys = True)
		self.w ({(): 1}, '{"()":1}', coerce_keys = True)
		
	if hasattr (collections, 'defaultdict'):
		def test_defaultdict (self):
			defdict = collections.defaultdict (lambda: 9)
			defdict['a'] = 42
			self.w (defdict, '{"a":42}')
			
	def test_fail_on_self_reference (self):
		a = {}
		a['a'] = a
		self.we (a, "Cannot serialize self-referential values.")
		
	def test_fail_on_self_reference_deep (self):
		a = {}
		a['a'] = [a]
		self.we (a, "Cannot serialize self-referential values.")
		
	def test_not_writing_comma_error (self):
		self.w ({'a': 1, 'b': 2, 'c': 3},
		        '{"a":1,"c":3,"b":2}')
		
	def test_userstring_key (self):
		self.w ({collections.UserString ('a'): 'b'}, '{"a":"b"}')
		
	def test_userstring_coerce (self):
		self.w ({collections.UserString ('a'): 'b'}, '{"a":"b"}', coerce_keys = True)
		
class WriteStringTests (SerializerTestCase):
	def test_empty_string (self):
		self.w ([''], '[""]', ascii_only = True)
		self.w ([''], '[""]', ascii_only = False)
		
	def test_escape_quote (self):
		self.w (['"'], '["\\""]', ascii_only = True)
		self.w (['"'], '["\\""]', ascii_only = False)
		
	def test_escape_reverse_solidus (self):
		self.w (['\\'], '["\\\\"]', ascii_only = True)
		self.w (['\\'], '["\\\\"]', ascii_only = False)
		
	def test_escape_solidus (self):
		self.w (['/'], '["\\/"]', ascii_only = True)
		self.w (['/'], '["\\/"]', ascii_only = False)
		
	def test_escape_backspace (self):
		self.w (['\b'], '["\\b"]', ascii_only = True)
		self.w (['\b'], '["\\b"]', ascii_only = False)
		
	def test_escape_form_feed (self):
		self.w (['\f'], '["\\f"]', ascii_only = True)
		self.w (['\f'], '["\\f"]', ascii_only = False)
		
	def test_escape_line_feed (self):
		self.w (['\n'], '["\\n"]', ascii_only = True)
		self.w (['\n'], '["\\n"]', ascii_only = False)
		
	def test_escape_carriage_return (self):
		self.w (['\r'], '["\\r"]', ascii_only = True)
		self.w (['\r'], '["\\r"]', ascii_only = False)
		
	def test_escape_tab (self):
		self.w (['\t'], '["\\t"]', ascii_only = True)
		self.w (['\t'], '["\\t"]', ascii_only = False)
		
	def test_escape_control_characters (self):
		special_escapes = tuple ('\b\t\n\f\r')
		
		for code in range (0x0, 0x1F + 1):
			char = chr (code)
			if char not in special_escapes:
				expected = '["\\u%04x"]' % code
				self.w ([char], expected, ascii_only = True)
				self.w ([char], expected, ascii_only = False)
				
	def test_noescape_above_control (self):
		self.w (['\u0020\u001f'], '[" \\u001f"]', ascii_only = True)
		self.w (['\u0020\u001f'], '[" \\u001f"]', ascii_only = False)
		
	def test_unicode_passthrough (self):
		self.w (['\u00B6\u00D7'], '["\u00b6\u00d7"]', ascii_only = False)
		self.w (['\u24CA'], '["\u24ca"]', ascii_only = False)
		self.w (['\U0001D11E'], '["\U0001D11E"]', ascii_only = False)
		
	def test_fail_incomplete_surrogate (self):
		self.we (['\uD834'], "Cannot serialize incomplete"
		                      " surrogate pair.")
		
	def test_fail_reserved_codepoint (self):
		self.we (['\uDD1E'], "Cannot serialize reserved code point U+DD1E.")
		
	def test_fail_invalid_surrogate (self):
		self.we (['\uD834\u0000'], "Cannot serialize invalid"
		                            " surrogate pair.")
		
	def test_escape_short_unicode (self):
		# Some Latin-1
		self.w (['\u00B6\u00D7'], '["\\u00b6\\u00d7"]')
		
		# Higher planes
		self.w (['\u24CA'], '["\\u24ca"]')
		
	def test_escape_long_unicode (self):
		# Should break into two UTF-16 codepoints
		self.w (['\U0001D11E'], '["\\ud834\\udd1e"]')
		
	def test_userstring (self):
		self.w ([collections.UserString ('test')], '["test"]')
		
class WriteEncodingTests (SerializerTestCase):
	# Don't use self.w in these, because it sets the encoding to
	# None.
	def test_encode_utf8_default (self):
		value = write (['\U0001D11E \u24CA'], ascii_only = False)
		self.assertEqual (type (value), bytes)
		self.assertEqual (value, b'["\xf0\x9d\x84\x9e \xe2\x93\x8a"]')
		
	def test_encode_utf16 (self):
		value = write (['\U0001D11E \u24CA'], ascii_only = False,
		               encoding = 'utf-16-le')
		self.assertEqual (type (value), bytes)
		self.assertEqual (value, b'\x5b\x00\x22\x00\x34\xd8\x1e\xdd'
		                         b'\x20\x00\xca\x24\x22\x00\x5d\x00')
		
	def test_encode_unicode_none (self):	
		value = write (['\U0001D11E \u24CA'], ascii_only = False,
		               encoding = None)
		self.assertEqual (type (value), str)
		self.assertEqual (value, '["\U0001D11E \u24CA"]')
		
class StreamingSerializerTests (SerializerTestCase):
	def test_serialize_to_stream (self):
		fp = io.BytesIO ()
		jsonlib.dump ([], fp)
		self.assertEqual (fp.getvalue (), b'[]')
		
	def test_serialize_complex_to_stream (self):
		fp = io.BytesIO ()
		jsonlib.dump (["a", "b", "c \U0001D11E \u24Ca", {"a": "b"}], fp)
		self.assertEqual (fp.getvalue (), b'["a","b","c \\ud834\\udd1e \\u24ca",{"a":"b"}]')
		
	def test_encode_utf16_specialcased (self):
		# Test that special cases that return pure ASCII are still
		# re-encoded if needed.
		fp = io.BytesIO ()
		value = jsonlib.dump ([], fp, encoding = 'utf-16-le')
		self.assertEqual (fp.getvalue (), b'[\x00]\x00')
		
	def test_no_encoding (self):
		fp = io.StringIO ()
		value = jsonlib.dump (["\u24CA"], fp, encoding = None)
		self.assertEqual (fp.getvalue (), '["\\u24ca"]')
		self.assertEqual (type (fp.getvalue ()), str)
		
	def test_no_encoding_full_unicode (self):
		fp = io.StringIO ()
		value = jsonlib.dump (["\u24CA"], fp, encoding = None, ascii_only = False)
		self.assertEqual (fp.getvalue (), '["\u24ca"]')
		self.assertEqual (type (fp.getvalue ()), str)
# }}}

if __name__ == '__main__':
	unittest.main (defaultTest = 'suite')
	
