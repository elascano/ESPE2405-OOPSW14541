/**
 * Copyright (C) 2008-2009 John Millikin <jmillikin@gmail.com>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
**/

#include <Python.h>
#include <stddef.h>
#include <stdio.h>
#include <ctype.h>
#include <math.h>

typedef struct _ModuleState
{
	PyObject *Decimal;
	PyObject *UserString;
	
	/* Constants, saved to avoid lookup in the serializer */
	PyObject *true_str;
	PyObject *false_str;
	PyObject *null_str;
} ModuleState;

/* Parser {{{ */
typedef struct _Parser
{
	Py_UNICODE *start, *end, *index;
	PyObject *error_helper;
	ModuleState *module;
	
	Py_UNICODE *stringparse_buffer;
	size_t stringparse_buffer_size;
	
	unsigned char use_float;
	unsigned char got_root;
} Parser;

static PyObject *
jsonlib_read (PyObject *, PyObject *);

static PyObject *
parse_raw (Parser *);

static PyObject *
parse_object (Parser *);

static PyObject *
parse_array (Parser *);

static PyObject *
parse_string (Parser *);

static PyObject *
parse_string_full (Parser *, Py_UNICODE *, size_t);

static unsigned char
parse_unicode_escape (Parser *, Py_UNICODE *, Py_UNICODE *,
                      size_t *, size_t *, size_t);

static PyObject *
parse_keyword (Parser *);

static PyObject *
parse_number (Parser *);

static unsigned char
skip_whitespace (Parser *, Py_UNICODE *, const char *);

static unsigned char
skip_char (Parser *, Py_UNICODE, const char *);

static PyObject *
parser_raise (Parser *, const char *);

static PyObject *
parser_raise_unexpected (Parser *, const char *);

static PyObject *
parser_raise_unterminated_string (Parser *, Py_UNICODE *);

static size_t
next_power_2 (size_t start, size_t min);

static PyObject *
jsonlib_read (PyObject *self, PyObject *args)
{
	PyObject *result = NULL, *text;
	Parser parser = {NULL};
	unsigned char use_float = 0;
	
	if (!PyArg_ParseTuple (args, "UbO", &text, &use_float, &parser.error_helper))
	{ return NULL; }
	
	parser.start = PyUnicode_AsUnicode (text);
	parser.end = parser.start + PyUnicode_GetSize (text);
	parser.index = parser.start;
	parser.use_float = use_float;
	parser.module = PyModule_GetState (self);
	
	skip_whitespace (&parser, NULL, NULL);
	result = parse_raw (&parser);
	skip_whitespace (&parser, NULL, NULL);
	
	if (result && parser.index != parser.end)
	{
		Py_DECREF (result);
		result = parser_raise (&parser, "extra_data");
	}
	
	PyMem_Free (parser.stringparse_buffer);
	return result;
}

static PyObject *
parse_raw (Parser *parser)
{
	Py_UNICODE c;
	
	if (parser->index == parser->end)
	{
		return PyObject_CallMethod (parser->error_helper, "no_expression", "uk",
			parser->start, 0);
	}
	
	c = *parser->index;
	if (c == '{')
	{
		parser->got_root = 1;
		return parse_object (parser);
	}
	
	if (c == '[')
	{
		parser->got_root = 1;
		return parse_array (parser);
	}
	
	if (!parser->got_root)
	{ return parser_raise_unexpected (parser, NULL); }
	
	switch (c)
	{
	case '"':
		return parse_string (parser);
	case 't':
	case 'f':
	case 'n':
		return parse_keyword (parser);
	case '-':
	case '0':
	case '1':
	case '2':
	case '3':
	case '4':
	case '5':
	case '6':
	case '7':
	case '8':
	case '9':
		return parse_number (parser);
	default:
		return parser_raise_unexpected (parser, NULL);
	}
}

static PyObject *
parse_object (Parser *parser)
{
	PyObject *retval = NULL, *key = NULL, *value = NULL;
	Py_UNICODE *start = parser->index;
	int result;
	
	++parser->index; /* '{' */
	
	if (!skip_whitespace (parser, start, "Unterminated object."))
	{ goto error; }
	
	retval = PyDict_New ();
	if (*parser->index == '}')
	{
		++parser->index;
		return retval;
	}
	
	while (1)
	{
		if (!skip_whitespace (parser, start, "Unterminated object."))
		{ goto error; }
		
		if (*parser->index != '"')
		{
			parser_raise_unexpected (parser, "property name");
			goto error;
		}
		
		if (!(key = parse_raw (parser)))
		{ goto error; }
		
		if (!skip_whitespace (parser, start, "Unterminated object."))
		{ goto error; }
		
		if (!skip_char (parser, ':', "colon"))
		{ goto error; }
		
		if (!skip_whitespace (parser, start, "Unterminated object."))
		{ goto error; }
		
		if (!(value = parse_raw (parser)))
		{ goto error; }
		
		result = PyDict_SetItem (retval, key, value);
		Py_DECREF (key);
		Py_DECREF (value);
		key = NULL;
		value = NULL;
		if (result == -1)
		{ goto error; }
		
		if (!skip_whitespace (parser, start, "Unterminated object."))
		{ goto error; }
		
		if (*parser->index == '}')
		{
			++parser->index;
			return retval;
		}
		
		if (!skip_char (parser, ',', "comma"))
		{ goto error; }
	}
	
	return retval;
error:
	Py_XDECREF (retval);
	Py_XDECREF (key);
	Py_XDECREF (value);
	return NULL;
}

static PyObject *
parse_array (Parser *parser)
{
	PyObject *retval = NULL, *value = NULL;
	Py_UNICODE *start = parser->index;
	int result;
	
	++parser->index; /* '[' */
	
	if (!skip_whitespace (parser, start, "Unterminated array."))
	{ goto error; }
	
	retval = PyList_New (0);
	if (*parser->index == ']')
	{
		++parser->index;
		return retval;
	}
	
	while (1)
	{
		if (!skip_whitespace (parser, start, "Unterminated array."))
		{ goto error; }
		
		if (!(value = parse_raw (parser)))
		{ goto error; }
		
		result = PyList_Append (retval, value);
		Py_DECREF (value);
		value = NULL;
		if (result == -1)
		{ goto error; }
		
		if (!skip_whitespace (parser, start, "Unterminated array."))
		{ goto error; }
		
		if (*parser->index == ']')
		{
			++parser->index;
			return retval;
		}
		
		if (!skip_char (parser, ',', "comma"))
		{ goto error; }
	}
	
	return retval;
error:
	Py_XDECREF (retval);
	Py_XDECREF (value);
	return NULL;
}

static PyObject *
parse_string (Parser *parser)
{
	PyObject *unicode;
	unsigned char escaped = 0, fancy = 0;
	Py_UNICODE c, *start, *end = parser->end;
	size_t ii;
	
	start = parser->index;
	
	/* Fast case for empty string */
	if (start[1] == '"')
	{
		parser->index = start + 2;
		return PyUnicode_FromUnicode (NULL, 0);
	}
	
	/* Scan through for maximum character count, and to ensure the string
	 * is terminated.
	**/
	for (ii = 1; start + ii < end; ++ii)
	{
		c = start[ii];
		
		/* Check for illegal characters */
		if (c < 0x20)
		{
			parser->index = start + ii;
			return parser_raise_unexpected (parser, NULL);
		}
		
		/* Invalid escape codes will be caught later. */
		if (escaped)
		{ escaped = 0; }
		
		else if (c == '\\')
		{
			fancy = 1;
			escaped = 1;
		}
		
		else if (c == '"')
		{ break; }
	}
	
	if (start + ii >= end)
	{ return parser_raise_unterminated_string (parser, start); }
	
	if (fancy)
	{ return parse_string_full (parser, start, ii); }
	
	/* No fancy features, return the string directly */
	if ((unicode = PyUnicode_FromUnicode (start + 1, ii - 1)))
	{ parser->index = start + ii + 1; }
	
	return unicode;
}

static PyObject *
parse_string_full (Parser *parser, Py_UNICODE *start, size_t max_char_count)
{
	PyObject *unicode;
	int escaped = 0;
	Py_UNICODE c, *buffer;
	size_t ii = 1, buffer_idx;
	
	/* Allocate enough to hold the worst case */
	buffer = parser->stringparse_buffer;
	if (max_char_count > parser->stringparse_buffer_size)
	{
		size_t new_size, existing_size;
		Py_UNICODE *new_buffer;
		existing_size = parser->stringparse_buffer_size;
		new_size = next_power_2 (1, max_char_count);
		new_buffer = PyMem_Resize (buffer, Py_UNICODE, new_size);
		if (!new_buffer)
		{ return NULL; }
		
		buffer = new_buffer;
		parser->stringparse_buffer = buffer;
		parser->stringparse_buffer_size = new_size;
	}
	
	/* Scan through the string, adding values to the buffer as
	 * appropriate.
	**/
	escaped = 0;
	buffer_idx = 0;
	
	while (1)
	{
		while (!escaped)
		{
			if (start + ii >= parser->end)
			{ return parser_raise_unterminated_string (parser, start); }
			
			c = start[ii];
			if (c == '\\') { escaped = 1; }
			else if (c == '"')
			{
				unicode = PyUnicode_FromUnicode (buffer, buffer_idx);
				if (unicode)
				{ parser->index = start + max_char_count + 1; }
				
				return unicode;
			}
			else { buffer[buffer_idx++] = c; }
			++ii;
		}
		
		escaped = 0;
		if (start + ii >= parser->end)
		{ return parser_raise_unterminated_string (parser, start); }
		
		c = start[ii];
		switch (c)
		{
		case '\\':
		case '"':
		case '/':
			buffer[buffer_idx++] = c;
			break;
		case 'b': buffer[buffer_idx++] = 0x08; break;
		case 'f': buffer[buffer_idx++] = 0x0C; break;
		case 'n': buffer[buffer_idx++] = 0x0A; break;
		case 'r': buffer[buffer_idx++] = 0x0D; break;
		case 't': buffer[buffer_idx++] = 0x09; break;
		case 'u':
			if (parse_unicode_escape (
				parser, start, buffer, &buffer_idx, &ii,
				max_char_count))
			{
				--ii;
				++buffer_idx;
				break;
			}
			else { return NULL; }
		default:
			return PyObject_CallMethod (
				parser->error_helper,
				"unknown_escape", "uku#",
				parser->start,
				(start - parser->start + ii - 1),
				&c, 1);
		}
		++ii;
	}
}

static unsigned char
read_4hex (Py_UNICODE *start, Py_UNICODE *retval_ptr)
{
	PyObject *py_long;
	
	py_long = PyLong_FromUnicode (start, 4, 16);
	if (!py_long) { return 0; }
	
	(*retval_ptr) = (Py_UNICODE) (PyLong_AsUnsignedLong (py_long));
	Py_DECREF (py_long);
	return 1;
}

static unsigned char
parse_unicode_escape (Parser *parser, Py_UNICODE *string_start, Py_UNICODE *buffer,
                      size_t *buffer_idx, size_t *index_ptr, size_t max_char_count)
{
	size_t remaining;
	size_t offset = *index_ptr;
	Py_UNICODE value;
	
	++offset;
	
	remaining = max_char_count - offset;
	if (remaining < 4)
	{
		PyObject_CallMethod (parser->error_helper,
			"unterminated_unicode", "uk",
			parser->start,
			(parser->index + offset - 2) - parser->start);
		return 0;
	}
	
	if (!read_4hex (string_start + offset, &value))
	{ return 0; }
	
	offset += 4;
	
	/* Check for surrogate pair */
	if (0xD800 <= value && value <= 0xDBFF)
	{
		Py_UNICODE upper = value, lower;
		
		if (remaining < 10)
		{
			PyObject_CallMethod (parser->error_helper,
				"missing_surrogate", "uk",
				parser->start,
				(parser->index + offset) - parser->start);
			return 0;
		}
		
		if (string_start[offset] != '\\' ||
		    string_start[offset + 1] != 'u')
		{
			PyObject_CallMethod (parser->error_helper,
				"missing_surrogate", "uk",
				parser->start,
				(parser->index + offset) - parser->start);
			return 0;
		}
		offset += 2;
		
		if (!read_4hex (string_start + offset, &lower))
		{ return 0; }
			
		offset += 4;
		
#		ifdef Py_UNICODE_WIDE
			upper -= 0xD800;
			lower -= 0xDC00;
			
			/* Merge upper and lower components */
			value = ((upper << 10) + lower) + 0x10000;
			buffer[*buffer_idx] = value;
#		else
			/* No wide character support, return surrogate pairs */
			buffer[(*buffer_idx)++] = upper;
			buffer[*buffer_idx] = lower;
#		endif
	}
	else if (0xDC00 <= value && value <= 0xDFFF)
	{
		PyObject_CallMethod (parser->error_helper,
			"reserved_code_point", "ukk",
			parser->start,
			(parser->index + offset - 6) - parser->start,
			value);
		return 0;
	}
	else
	{
		buffer[*buffer_idx] = value;
	}
	*index_ptr = offset;
	return 1;
}

static PyObject *
keyword_compare (Parser *parser, const char *expected, size_t len,
                 PyObject *retval)
{
	size_t ii;
	Py_UNICODE *index = parser->index;
	
	if (parser->end - index < len)
	{ return NULL; }
	
	for (ii = 0; expected[ii]; ++ii)
	{
		if (parser->index[ii] != (unsigned char)(expected[ii]))
		{ return NULL; }
	}
	
	parser->index += ii;
	Py_INCREF (retval);
	return retval;
}

static PyObject *
parse_keyword (Parser *parser)
{
	PyObject *kw = NULL;
	if ((kw = keyword_compare (parser, "true", 4, Py_True)))
		return kw;
	if ((kw = keyword_compare (parser, "false", 5, Py_False)))
		return kw;
	if ((kw = keyword_compare (parser, "null", 4, Py_None)))
		return kw;
	return parser_raise_unexpected (parser, NULL);
}

static PyObject *
parse_number (Parser *parser)
{
	PyObject *object = NULL;
	unsigned char is_float = 0, should_stop = 0, got_digit = 0,
	              leading_zero = 0, has_exponent = 0;
	Py_UNICODE *ptr;
	
	ptr = parser->index;
	
	while (ptr < parser->end)
	{
		switch (*ptr)
		{
		case '0':
			if (!got_digit)
			{ leading_zero = 1; }
			
			else if (leading_zero && !is_float)
			{ return parser_raise (parser, "invalid_number"); }
			
			got_digit = 1;
			break;
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			if (leading_zero && !is_float)
			{ return parser_raise (parser, "invalid_number"); }
			
			got_digit = 1;
			break;
		case '-':
		case '+':
			break;
		case 'e':
		case 'E':
			has_exponent = 1;
			break;
		case '.':
			is_float = 1;
			got_digit = 0;
			break;
		default:
			should_stop = 1;
		}
		if (should_stop)
		{ break; }
		++ptr;
	}
	
	if (got_digit)
	{
		if (is_float || has_exponent)
		{
			PyObject *str;
			if (!(str = PyUnicode_FromUnicode (parser->index,
			                                   ptr - parser->index)))
			{ return NULL; }
			
			if (parser->use_float)
			{ object = PyFloat_FromString (str); }
			
			else
			{
				object = PyObject_CallFunctionObjArgs (
					parser->module->Decimal, str, NULL);
			}
			Py_DECREF (str);
		}
		
		else
		{
			object = PyLong_FromUnicode (parser->index,
			                             ptr - parser->index, 10);
		}
	}
	
	if (!object)
	{ return parser_raise (parser, "invalid_number"); }
	
	parser->index = ptr;
	return object;
}

static unsigned char
skip_whitespace (Parser *parser, Py_UNICODE *start, const char *message)
{
	Py_UNICODE *index = parser->index, *end = parser->end;
	
	if (message && !start)
	{ start = index; }
	
	/* Don't use Py_UNICODE_ISSPACE, because it returns TRUE for
	 * codepoints that are not valid JSON whitespace.
	**/
	while (index < end)
	{
		switch (*index)
		{
		case '\x09':
		case '\x0A':
		case '\x0D':
		case '\x20':
			++index;
			break;
		default:
			parser->index = index;
			return 1;
		}
	}
	parser->index = index;
	
	if (message)
	{
		PyObject_CallMethod (parser->error_helper, "generic", "uks",
		                     parser->start, (start - parser->start),
		                     message);
		return 0;
	}
	return 1;
}

static unsigned char
skip_char (Parser *parser, Py_UNICODE c, const char *message)
{
	if (c != *parser->index)
	{
		parser_raise_unexpected (parser, message);
		return 0;
	}
	
	++parser->index;
	return 1;
}

static PyObject *
parser_raise (Parser *parser, const char *error_key)
{
	return PyObject_CallMethod (parser->error_helper, (char*)error_key, "uk",
		parser->start, (parser->index - parser->start));
}

static PyObject *
parser_raise_unexpected (Parser *parser, const char *message)
{
	return PyObject_CallMethod (parser->error_helper, "unexpected", "uks",
		parser->start, (parser->index - parser->start), message);
}

static PyObject *
parser_raise_unterminated_string (Parser *parser, Py_UNICODE *start)
{
	return PyObject_CallMethod (parser->error_helper, "unterminated_string", "uk",
		parser->start, (start - parser->start));
}

static size_t
next_power_2 (size_t start, size_t min)
{
	while (start < min)
	{ start <<= 1; }
	
	return start;
}

/* }}} */

/* Serializer {{{ */
typedef struct _Serializer Serializer;
struct _Serializer
{
	ModuleState *module;
	Py_UNICODE *buffer;
	size_t buffer_size;
	
	/* Virtual implementation methods */
	unsigned char (*flush) (Serializer *);
	
	/* Per-run constant. This isn't saved in the module state
	 * because it varies based on the indentation mode.
	**/
	PyObject *colon;
	
	/* Serialization options */
	PyObject *indent;
	PyObject *on_unknown;
	PyObject *error_helper;
	unsigned char sort_keys;
	unsigned char coerce_keys;
	unsigned char ascii_only;
};

typedef struct _BufferList BufferList;
struct _BufferList
{
	Py_UNICODE *buffer;
	size_t buffer_size;
	BufferList *next;
};

typedef struct _BufferSerializer
{
	Serializer base;
	const char *encoding;
	BufferList *all_buffers;
	BufferList *current_buffer;
} BufferSerializer;

typedef struct _StreamSerializer
{
	Serializer base;
	PyObject *stream;
	char *encoding;
} StreamSerializer;

static const char hexdigit[] = "0123456789abcdef";
#define FIXED_BUFFER_SIZE 1024

static PyObject *
jsonlib_write (PyObject *, PyObject *);

static PyObject *
jsonlib_dump (PyObject *, PyObject *);

static unsigned char
serializer_run (Serializer *, PyObject *);

/* Generic serialization procedures */
static unsigned char
serialize_object (Serializer *, PyObject *, unsigned int, unsigned char);

static unsigned char
serialize_mapping (Serializer *, PyObject *, unsigned int);

static unsigned char
serialize_iterator (Serializer *, PyObject *, PyObject *, unsigned int);

static unsigned char
serialize_atom (Serializer *, PyObject *);

static unsigned char
serialize_string (Serializer *, PyObject *);

/* Special-case procedures, for performance */
static unsigned char
serialize_atom_fast (Serializer *, PyObject *);

static unsigned char
serialize_dict (Serializer *, PyObject *, unsigned int);

static PyObject *
escape_string_ascii (PyObject *);

static PyObject *
escape_string_unicode (PyObject *);

static unsigned char
serialize_float (Serializer *, PyObject *);

static unsigned char
serialize_complex (Serializer *, PyObject *);

static unsigned char
serialize_decimal (Serializer *, PyObject *);

static unsigned char
serializer_raise (Serializer *, const char *);

static unsigned char
serializer_raise_reserved_cp (Serializer *, Py_UNICODE);

static unsigned char
serializer_append_ascii (Serializer *, const char *);

static unsigned char
serializer_append_unicode (Serializer *, PyObject *);

static unsigned char
buffer_serializer_flush (Serializer *);

static BufferList *
alloc_buffer_list (void);

static PyObject *
buffer_serializer_merge (BufferSerializer *);

static void
buffer_serializer_free (BufferSerializer *);

static unsigned char
stream_serializer_flush (Serializer *);

static PyObject *
ascii_constant (const char *value)
{
	return PyUnicode_DecodeASCII (value, strlen (value), "strict");
}

static PyObject *
jsonlib_write (PyObject *self, PyObject *args)
{
	PyObject *result = NULL;
	BufferSerializer serializer = {{NULL}, NULL};
	Serializer *base = (Serializer *) &serializer;
	
	/* Parameters */
	PyObject *value;
	unsigned char sort_keys, ascii_only, coerce_keys;
	
	if (!PyArg_ParseTuple(args, "ObObbzOO",
		&value,
		&sort_keys,
		&base->indent,
		&ascii_only,
		&coerce_keys,
		&serializer.encoding,
		&base->on_unknown,
		&base->error_helper))
	{ return NULL; }
	
	base->sort_keys = sort_keys;
	base->ascii_only = ascii_only;
	base->coerce_keys = coerce_keys;
	
	/* Implementation pointers */
	base->module = PyModule_GetState (self);
	base->flush = buffer_serializer_flush;
	
	if (!serializer_run (base, value))
	{ goto error; }
	
	/* Merge all buffers into a single unicode string */
	result = buffer_serializer_merge (&serializer);
	
error:
	buffer_serializer_free (&serializer);
	return result;
}

static PyObject *
jsonlib_dump (PyObject *self, PyObject *args)
{
	StreamSerializer serializer = {{NULL}, NULL};
	Serializer *base = (Serializer *) &serializer;
	
	/* Parameters */
	PyObject *value;
	unsigned char sort_keys, ascii_only, coerce_keys;
	
	if (!PyArg_ParseTuple(args, "OObObbzOO",
		&value,
		&serializer.stream,
		&sort_keys,
		&base->indent,
		&ascii_only,
		&coerce_keys,
		&serializer.encoding,
		&base->on_unknown,
		&base->error_helper))
	{ return NULL; }
	
	base->sort_keys = sort_keys;
	base->ascii_only = ascii_only;
	base->coerce_keys = coerce_keys;
	
	/* Implementation pointers */
	base->module = PyModule_GetState (self);
	base->flush = stream_serializer_flush;
	
	if (!serializer_run (base, value))
	{ return NULL; }
	
	Py_RETURN_NONE;
}

static unsigned char
serializer_run (Serializer *s, PyObject *value)
{
	const char *colon;
	unsigned char retval;
	Py_UNICODE fixed_buffer[FIXED_BUFFER_SIZE];
	
	/* Generate the colon constant */
	colon = s->indent == Py_None? ":" : ": ";
	if (!(s->colon = ascii_constant (colon)))
	{ return 0; }
	
	/* Small buffer for more efficient streaming */
	s->buffer = fixed_buffer;
	s->buffer_size = 0;
	
	/* Run, clean up, return */
	retval = serialize_object (s, value, 0, 0);
	Py_DECREF (s->colon);
	
	if (s->buffer_size > 0)
	{
		if (!(s->flush(s)))
		{ return 0; }
	}
	
	return retval;
}

static unsigned char
serialize_object (Serializer *s, PyObject *value,
                  unsigned int indent_level, unsigned char in_unknown_hook)
{
	PyObject *new_value, *iter, *unknown_error_func;
	unsigned char retval;
	
	Py_INCREF (value);
	
	/* Fast special-case tests */
	
	/* Check built-in atomic types */
	retval = serialize_atom_fast (s, value);
	
	if (retval == 0 || retval == 1)
	{
		if (indent_level == 0 && retval == 1)
		{
			serializer_raise (s, "invalid_root");
			goto error;
		}
		goto done;
	}
	
	if (PyDict_CheckExact (value) && !s->sort_keys)
	{
		retval = serialize_dict (s, value, indent_level);
		goto done;
	}
	
	if (PyList_CheckExact (value))
	{
		if (!(iter = PyObject_GetIter (value)))
		{ goto error; }
		
		retval = serialize_iterator (s, iter, value, indent_level);
		Py_DECREF (iter);
		goto done;
	}
	
	/* Slow, general tests */
	retval = serialize_atom (s, value);
	if (retval == 0 || retval == 1)
	{
		if (indent_level == 0 && retval == 1)
		{
			serializer_raise (s, "invalid_root");
			goto error;
		}
		goto done;
	}
	
	/* http://bugs.python.org/issue5945 */
	/*if (PyMapping_Check (value))*/
	if (PyObject_HasAttrString (value, "items"))
	{
		retval = serialize_mapping (s, value, indent_level);
		goto done;
	}
	
	if ((iter = PyObject_GetIter (value)))
	{
		retval = serialize_iterator (s, iter, value, indent_level);
		Py_DECREF (iter);
		goto done;
	}
	PyErr_Clear ();
	
	if (in_unknown_hook)
	{
		PyObject_CallMethod (s->error_helper,
			"unknown_serializer",
			"O", value);
		goto error;
	}
	
	unknown_error_func = PyObject_GetAttrString (
		s->error_helper, "unknown_serializer");
	if (!unknown_error_func)
	{ goto error; }
	
	new_value = PyObject_CallFunctionObjArgs (s->on_unknown,
		value, unknown_error_func, NULL);
	Py_DECREF (unknown_error_func);
	if (!new_value)
	{ goto error; }
	
	retval = serialize_object (s, new_value, indent_level, 1);
	Py_DECREF (new_value);
	goto done;
	
error:
	retval = 0;
done:
	Py_DECREF (value);
	return retval;
}

static unsigned char
serialize_check_recursion (Serializer *s, PyObject *value)
{
	int repr_ret = Py_ReprEnter (value);
	if (repr_ret > 0)
	{ serializer_raise (s, "self_referential"); }
	
	return (repr_ret == 0);
}

static unsigned char
serializer_separators (Serializer *s, unsigned int indent_level,
                       PyObject **indent_ret, PyObject **post_indent_ret)
{
	PyObject *repeated[2] = {NULL}, *indent = NULL, *post_indent = NULL;
	unsigned char retval = 1;
	
	*indent_ret = NULL;
	*post_indent_ret = NULL;
	if (s->indent == Py_None)
	{ return 1; }
	
	repeated[0] = PySequence_Repeat (s->indent, indent_level);
	repeated[1] = PySequence_Repeat (s->indent, indent_level + 1);
	
	if (!(repeated[0] && repeated[1]))
	{ goto error; }
	
	indent = PyUnicode_FromFormat ("\n%S", repeated[1]);
	post_indent = PyUnicode_FromFormat ("\n%S", repeated[0]);
	
	if (!(indent && post_indent))
	{ goto error; }
	
	*indent_ret = indent;
	*post_indent_ret = post_indent;
	
	goto success;
error:
	retval = 0;
	Py_XDECREF (indent);
	Py_XDECREF (post_indent);
success:
	Py_XDECREF (repeated[0]);
	Py_XDECREF (repeated[1]);
	return retval;
}

static PyObject *
serializer_validate_mapping_key (Serializer *s, PyObject *key)
{
	unsigned char valid;
	
	/* Check for a valid key */
	valid = PyUnicode_Check (key);
	if (!valid)
	{
		PyObject *new_key;
		if (PyObject_IsInstance (key, s->module->UserString) == 1)
		{
			if (!(new_key = PyObject_GetAttrString (key, "data")))
			{ goto error; }
			Py_DECREF (key);
			key = new_key;
			valid = PyUnicode_Check (key);
		}
		
		if (!valid && !s->coerce_keys)
		{
			serializer_raise (s, "invalid_object_key");
			goto error;
		}
		
		if (!(new_key = PyObject_Str (key)))
		{ goto error; }
		Py_DECREF (key);
		key = new_key;
	}
	return key;
error:
	Py_DECREF (key);
	return NULL;
}

static unsigned char
serializer_get_mapping_pair (Serializer *s, PyObject *iter,
                             PyObject **key_ret, PyObject **value_ret,
                             unsigned char *error_ret)
{
	PyObject *key = NULL, *value = NULL, *pair = NULL;
	
	*key_ret = NULL;
	*value_ret = NULL;
	
	if (!(pair = PyIter_Next (iter)))
	{ return 0; }
	
	if (!(key = PySequence_GetItem (pair, 0)))
	{ goto error; }
	
	/* Check for a valid key */
	if (!(key = serializer_validate_mapping_key (s, key)))
	{ goto error; }
	
	if (!(value = PySequence_GetItem (pair, 1)))
	{ goto error; }
	
	Py_DECREF (pair);
	*key_ret = key;
	*value_ret = value;
	*error_ret = 0;
	return 1;
error:
	Py_DECREF (pair);
	Py_XDECREF (key);
	Py_XDECREF (value);
	*error_ret = 1;
	return 0;
}

static unsigned char
serialize_mapping (Serializer *s, PyObject *mapping,
                   unsigned int indent_level)
{
	unsigned char retval = 1, first = 1, error;
	PyObject *indent = NULL, *post_indent = NULL, *keys = NULL,
	         *iter = NULL, *key = NULL, *value = NULL;
	
	if (!serialize_check_recursion (s, mapping))
	{ return 0; }
	
	if (!(keys = PyMapping_Items (mapping)))
	{ goto error; }
	
	if (s->sort_keys)
	{
		PyObject *old_keys = keys;
		keys = PySequence_List (old_keys);
		Py_DECREF (old_keys);
		if (!keys)
		{ goto error; }
		
		if (PyList_Sort (keys) == -1)
		{ goto error; }
	}
	
	if (!(iter = PyObject_GetIter (keys)))
	{ goto error; }
	
	if (!serializer_separators (s, indent_level, &indent, &post_indent))
	{ goto error; }
	
	if (!serializer_append_ascii (s, "{"))
	{ goto error; }
	
	while ((serializer_get_mapping_pair (s, iter, &key, &value, &error)))
	{
		if (first)
		{ first = 0; }
		
		else if (!serializer_append_ascii (s, ","))
		{ goto error; }
		
		if (indent && !serializer_append_unicode (s, indent))
		{ goto error; }
		
		if (!serialize_object (s, key, indent_level + 1, 0))
		{ goto error; }
		
		if (!serializer_append_unicode (s, s->colon))
		{ goto error; }
		
		if (!serialize_object (s, value, indent_level + 1, 0))
		{ goto error; }
		
		Py_DECREF (key);
		Py_DECREF (value);
	}
	if (error)
	{ goto error; }
	
	if (post_indent &&!serializer_append_unicode (s, post_indent))
	{ goto error; }
	
	if (!serializer_append_ascii (s, "}"))
	{ goto error; }
	
	goto success;
error:
	retval = 0;
success:
	Py_XDECREF (indent);
	Py_XDECREF (post_indent);
	Py_XDECREF (keys);
	Py_XDECREF (iter);
	Py_XDECREF (key);
	Py_XDECREF (value);
	Py_ReprLeave (mapping);
	return retval;
}

static unsigned char
serialize_iterator (Serializer *s, PyObject *iter,
                    PyObject *value, unsigned int indent_level)
{
	unsigned char retval = 1, first = 1;
	PyObject *indent = NULL, *post_indent = NULL, *item = NULL;
	
	if (!serialize_check_recursion (s, value))
	{ return 0; }
	
	if (!serializer_separators (s, indent_level, &indent, &post_indent))
	{ goto error; }
	
	if (!serializer_append_ascii (s, "["))
	{ goto error; }
	
	while ((item = PyIter_Next (iter)))
	{
		if (first)
		{ first = 0; }
		
		else if (!serializer_append_ascii (s, ","))
		{ goto error; }
		
		if (indent && !serializer_append_unicode (s, indent))
		{ goto error; }
		
		if (!serialize_object (s, item, indent_level + 1, 0))
		{ goto error; }
		
		Py_DECREF (item);
	}
	
	if (post_indent && !serializer_append_unicode (s, post_indent))
	{ goto error; }
	
	if (!serializer_append_ascii (s, "]"))
	{ goto error; }
	
	goto success;
error:
	retval = 0;
success:
	Py_XDECREF (indent);
	Py_XDECREF (post_indent);
	Py_XDECREF (item);
	Py_ReprLeave (value);
	return retval;
}

static unsigned char
serialize_atom_fast (Serializer *s, PyObject *value)
{
	ModuleState *m = s->module;
	unsigned char retval;
	
	if (value == Py_True)
	{ return serializer_append_unicode (s, m->true_str); }
	
	if (value == Py_False)
	{ return serializer_append_unicode (s, m->false_str); }
	
	if (value == Py_None)
	{ return serializer_append_unicode (s, m->null_str); }
	
	if (PyUnicode_CheckExact (value))
	{ return serialize_string (s, value); }
	
	if (PyLong_CheckExact (value))
	{
		PyObject *str;
		if (!(str = PyObject_Str (value)))
		{ return 0; }
		
		retval = serializer_append_unicode (s, str);
		Py_DECREF (str);
		return retval;
	}
	
	if (PyFloat_CheckExact (value))
	{ return serialize_float (s, value); }
	
	if (PyComplex_CheckExact (value))
	{ return serialize_complex (s, value); }
	
	return 2;
}

static unsigned char
serializer_validate_string (Serializer *s, Py_UNICODE *chars,
                            Py_ssize_t char_count)
{
	Py_ssize_t ii;
	
	/* Scan through again to check for invalid surrogate pairs */
	for (ii = 0; ii < char_count; ++ii)
	{
		if (0xD800 <= chars[ii] && chars[ii] <= 0xDBFF)
		{
			if (++ii == char_count)
			{
				return serializer_raise (s, "incomplete_surrogate");
			}
			
			if (!(0xDC00 <= chars[ii] && chars[ii] <= 0xDFFF))
			{
				return serializer_raise (s, "invalid_surrogate");
			}
		}
		else if (0xDC00 <= chars[ii] && chars[ii] <= 0xDFFF)
		{
			return serializer_raise_reserved_cp (s, chars[ii]);
		}
	}
	return 1;
}

static unsigned char
serialize_string (Serializer *s, PyObject *value)
{
	unsigned char safe = 1, retval = 1;
	Py_UNICODE *chars, c;
	Py_ssize_t char_count, ii;
	PyObject *escaped = NULL;
	
	/* Scan the string for non-ASCII or unprintable values. If none are
	 * found, the string can be sent directly.
	**/
	chars = PyUnicode_AS_UNICODE (value);
	char_count = PyUnicode_GET_SIZE (value);
	for (ii = 0; ii < char_count; ii++)
	{
		c = chars[ii];
		if (c == '"' || c == '/' || c == '\\' ||
		    c < 0x20 || c > 0x7E)
		{
			safe = 0;
			break;
		}
	}
	
	if (safe)
	{
		if (!serializer_append_ascii (s, "\""))
		{ goto error; }
		if (!serializer_append_unicode (s, value))
		{ goto error; }
		if (!serializer_append_ascii (s, "\""))
		{ goto error; }
		
		return 1;
	}
	
	if (!serializer_validate_string (s, chars, char_count))
	{ goto error; }
	
	if (s->ascii_only)
	{ escaped = escape_string_ascii (value); }
	else
	{ escaped = escape_string_unicode (value); }
	
	if (escaped && serializer_append_unicode (s, escaped))
	{ goto success; }
	
error:
	retval = 0;
success:
	Py_XDECREF (escaped);
	return retval;
}

static unsigned char
serialize_atom (Serializer *s, PyObject *value)
{
	ModuleState *m = s->module;
	unsigned char retval = 2;
	
	if (PyObject_IsInstance (value, m->Decimal))
	{ return serialize_decimal (s, value); }
	
	if (PyUnicode_Check (value))
	{ return serialize_string (s, value); }
	
	if (PyLong_Check (value))
	{
		PyObject *str;
		if (!(str = PyObject_Str (value)))
		{ return 0; }
		
		retval = serializer_append_unicode (s, str);
		Py_DECREF (str);
		return retval;
	}
	
	if (PyFloat_Check (value))
	{ return serialize_float (s, value); }
	
	if (PyComplex_Check (value))
	{ return serialize_complex (s, value); }
	
	/* UserStrings need to be unwrapped. */
	if (PyObject_IsInstance (value, s->module->UserString) == 1)
	{
		PyObject *data;
		if (!(data = PyObject_GetAttrString (value, "data")))
		{ return 0; }
		
		if (PyUnicode_Check (data))
		{ retval = serialize_string (s, data); }
		
		Py_DECREF (data);
		return retval;
	}
	
	return retval;
}

static unsigned char
serialize_dict (Serializer *s, PyObject *dict, unsigned int indent_level)
{
	unsigned char retval = 1, first = 1;
	Py_ssize_t dict_pos = 0;
	PyObject *indent = NULL, *post_indent = NULL,
	         *key = NULL, *value = NULL;
	
	if (!serialize_check_recursion (s, dict))
	{ return 0; }
	
	if (!serializer_separators (s, indent_level, &indent, &post_indent))
	{ goto error; }
	
	if (!serializer_append_ascii (s, "{"))
	{ goto error; }
	
	while (PyDict_Next (dict, &dict_pos, &key, &value))
	{
		Py_INCREF (key);
		Py_INCREF (value);
		
		if (!(key = serializer_validate_mapping_key (s, key)))
		{ goto error; }
		
		if (first)
		{ first = 0; }
		
		else if (!serializer_append_ascii (s, ","))
		{ goto error; }
		
		if (indent && !serializer_append_unicode (s, indent))
		{ goto error; }
		
		if (!serialize_object (s, key, indent_level + 1, 0))
		{ goto error; }
		
		if (!serializer_append_unicode (s, s->colon))
		{ goto error; }
		
		if (!serialize_object (s, value, indent_level + 1, 0))
		{ goto error; }
		
		Py_DECREF (key);
		Py_DECREF (value);
		key = NULL;
		value = NULL;
	}
	
	if (post_indent && !serializer_append_unicode (s, post_indent))
	{ goto error; }
	
	if (!serializer_append_ascii (s, "}"))
	{ goto error; }
	
	goto success;
error:
	retval = 0;
success:
	Py_XDECREF (indent);
	Py_XDECREF (post_indent);
	Py_XDECREF (key);
	Py_XDECREF (value);
	Py_ReprLeave (dict);
	return retval;
}

static Py_UNICODE *
escape_unichar (Py_UNICODE c, Py_UNICODE *p)
{
	*p++ = '\\';
	switch (c)
	{
		case 0x08: *p++ = 'b'; return p;
		case 0x09: *p++ = 't'; return p;
		case 0x0A: *p++ = 'n'; return p;
		case 0x0C: *p++ = 'f'; return p;
		case 0x0D: *p++ = 'r'; return p;
		case 0x22: *p++ = '"'; return p;
		case 0x2F: *p++ = '/'; return p;
		case 0x5C: *p++ = '\\'; return p;
		default: break;
	}
#ifdef Py_UNICODE_WIDE
	if (c > 0xFFFF)
	{
		/* Separate into upper and lower surrogate pair */
		Py_UNICODE reduced, upper, lower;
		
		reduced = c - 0x10000;
		lower = (reduced & 0x3FF);
		upper = (reduced >> 10);
		
		upper += 0xD800;
		lower += 0xDC00;
		
		*p++ = 'u';
		*p++ = hexdigit[(upper >> 12) & 0xF];
		*p++ = hexdigit[(upper >> 8) & 0xF];
		*p++ = hexdigit[(upper >> 4) & 0xF];
		*p++ = hexdigit[upper & 0xF];
		
		*p++ = '\\';
		*p++ = 'u';
		*p++ = hexdigit[(lower >> 12) & 0xF];
		*p++ = hexdigit[(lower >> 8) & 0xF];
		*p++ = hexdigit[(lower >> 4) & 0xF];
		*p++ = hexdigit[lower & 0xF];
		return p;
	}
#endif
	*p++ = 'u';
	*p++ = hexdigit[(c >> 12) & 0xF];
	*p++ = hexdigit[(c >> 8) & 0xF];
	*p++ = hexdigit[(c >> 4) & 0xF];
	*p++ = hexdigit[c & 0xF];
	return p;
}

static PyObject *
escape_string_ascii (PyObject *value)
{
	PyObject *retval;
	Py_UNICODE *old_buffer, *p, c;
	size_t ii, old_buffer_size, new_buffer_size;
	
	old_buffer = PyUnicode_AS_UNICODE (value);
	old_buffer_size = PyUnicode_GET_SIZE (value);
	
	/*
	Calculate the size needed to store the final string:
	
		* 2 chars for opening and closing quotes
		* 2 chars each for each of these characters:
			* U+0008
			* U+0009
			* U+000A
			* U+000C
			* U+000D
			* U+0022
			* U+002F
			* U+005C
		* 6 chars for other characters <= U+001F
		* 12 chars for characters > 0xFFFF
		* 6 chars for characters > 0x7E
		* 1 char for other characters.
	
	*/
	new_buffer_size = 2;
	for (ii = 0; ii < old_buffer_size; ii++)
	{
		c = old_buffer[ii];
		if (c == 0x08 ||
		    c == 0x09 ||
		    c == 0x0A ||
		    c == 0x0C ||
		    c == 0x0D ||
		    c == 0x22 ||
		    c == 0x2F ||
		    c == 0x5C)
		{ new_buffer_size += 2; }
		else if (c <= 0x1F)
		{ new_buffer_size += 6; }
		
#		ifdef Py_UNICODE_WIDE
		else if (c > 0xFFFF)
		{ new_buffer_size += 12; }
#		endif
		
		else if (c > 0x7E)
		{ new_buffer_size += 6; }
		else
		{ new_buffer_size += 1; }
	}
	
	if (!(retval = PyUnicode_FromUnicode (NULL, new_buffer_size)))
	{ return NULL; }
	
	/* Fill the new buffer */
	p = PyUnicode_AS_UNICODE (retval);
	*p++ = '"';
	for (ii = 0; ii < old_buffer_size; ii++)
	{
		c = old_buffer[ii];
		if (c > 0x1F &&
		    c <= 0x7E &&
		    c != '\\' &&
		    c != '"' &&
		    c != '/')
		{ *p++ = c; }
		
		else
		{ p = escape_unichar (c, p); }
	}
	
	*p++ = '"';
	return retval;
}

static PyObject *
escape_string_unicode (PyObject *value)
{
	PyObject *retval;
	Py_UNICODE *old_buffer, *p, c;
	size_t ii, old_buffer_size, new_buffer_size;
	
	old_buffer = PyUnicode_AS_UNICODE (value);
	old_buffer_size = PyUnicode_GET_SIZE (value);
	
	/*
	Calculate the size needed to store the final string:
	
		* 2 chars for opening and closing quotes
		* 2 chars each for each of these characters:
			* U+0008
			* U+0009
			* U+000A
			* U+000C
			* U+000D
			* U+0022
			* U+002F
			* U+005C
		* 6 chars for other characters <= U+001F
		* 1 char for other characters.
	
	*/
	new_buffer_size = 2;
	for (ii = 0; ii < old_buffer_size; ii++)
	{
		c = old_buffer[ii];
		if (c == 0x08 ||
		    c == 0x09 ||
		    c == 0x0A ||
		    c == 0x0C ||
		    c == 0x0D ||
		    c == 0x22 ||
		    c == 0x2F ||
		    c == 0x5C)
		{ new_buffer_size += 2; }
		else if (c <= 0x1F)
		{ new_buffer_size += 6; }
		else
		{ new_buffer_size += 1; }
	}
	
	if (!(retval = PyUnicode_FromUnicode (NULL, new_buffer_size)))
	{ return NULL; }
	
	/* Fill the new buffer */
	p = PyUnicode_AS_UNICODE (retval);
	*p++ = '"';
	for (ii = 0; ii < old_buffer_size; ii++)
	{
		c = old_buffer[ii];
		if (c == 0x08)
		{ *p++ = '\\', *p++ = 'b'; }
		
		else if (c == 0x09)
		{ *p++ = '\\', *p++ = 't'; }
		
		else if (c == 0x0A)
		{ *p++ = '\\', *p++ = 'n'; }
		
		else if (c == 0x0C)
		{ *p++ = '\\', *p++ = 'f'; }
		
		else if (c == 0x0D)
		{ *p++ = '\\', *p++ = 'r'; }
		
		else if (c == 0x22)
		{ *p++ = '\\', *p++ = '"'; }
		
		else if (c == 0x2F)
		{ *p++ = '\\', *p++ = '/'; }
		
		else if (c == 0x5C)
		{ *p++ = '\\', *p++ = '\\'; }
		
		else if (c <= 0x1F)
		{
			*p++ = '\\';
			*p++ = 'u';
			*p++ = '0';
			*p++ = '0';
			*p++ = hexdigit[(c >> 4) & 0x0000000F];
			*p++ = hexdigit[c & 0x0000000F];
		}
		
		else
		{ *p++ = c; }
	}
	
	*p++ = '"';
	return retval;
}

static unsigned char
serialize_float (Serializer *s, PyObject *value)
{
	PyObject *repr;
	unsigned char retval;
	double val = PyFloat_AS_DOUBLE (value);
	
	if (Py_IS_NAN (val))
	{ return serializer_raise (s, "no_nan"); }
	
	if (Py_IS_INFINITY (val))
	{
		if (val < 0)
		{ return serializer_raise (s, "no_neg_infinity"); }
		
		return serializer_raise (s, "no_infinity");
	}
	
	if (!(repr = PyObject_Repr (value)))
	{ return 0; }
	
	retval = serializer_append_unicode (s, repr);
	Py_DECREF (repr);
	return retval;
}

static unsigned char
serialize_complex (Serializer *s, PyObject *value)
{
	Py_complex complex = PyComplex_AsCComplex (value);
	PyObject *real, *repr = NULL;
	unsigned char retval;
	
	if (complex.imag != 0)
	{ return serializer_raise (s, "no_imaginary"); }
	
	if (!(real = PyFloat_FromDouble (complex.real)))
	{ return 0; }
	
	repr = PyObject_Repr (real);
	Py_DECREF (real);
	if (!repr)
	{ return 0; }
	
	retval = serializer_append_unicode (s, repr);
	Py_DECREF (repr);
	return retval;
}

static unsigned char
serialize_decimal (Serializer *s, PyObject *value)
{
	PyObject *str = NULL;
	const char *error = NULL;
	unsigned char retval = 1;
	
	if (!(str = PyObject_Str (value)))
	{ return 0; }
	
	if (PyUnicode_CompareWithASCIIString (str, "Infinity") == 0)
	{ error = "no_infinity"; }
	
	else if (PyUnicode_CompareWithASCIIString (str, "-Infinity") == 0)
	{ error = "no_neg_infinity"; }
	
	else if (PyUnicode_CompareWithASCIIString (str, "NaN") == 0)
	{ error = "no_nan"; }
	
	if (error)
	{ retval = serializer_raise (s, error); }
	else
	{ retval = serializer_append_unicode (s, str); }
	
	Py_DECREF (str);
	return retval;
}

static unsigned char
serializer_raise (Serializer *s, const char *error_key)
{
	PyObject_CallMethod (s->error_helper, (char*)error_key, "");
	return 0;
}

static unsigned char
serializer_raise_reserved_cp (Serializer *s, Py_UNICODE c)
{
	PyObject_CallMethod (s->error_helper,
	                     "reserved_code_point", "k", c);
	return 0;
}

static unsigned char
serializer_append_ascii (Serializer *s, const char *text)
{
	/* Copy text to s->buffer, flushing as needed */
	for (; *text; text++)
	{
		if (s->buffer_size == FIXED_BUFFER_SIZE)
		{
			if (!(s->flush (s)))
			{ return 0; }
		}
		s->buffer[s->buffer_size++] = *text;
	}
	
	return 1;
}

static unsigned char
serializer_append_unicode (Serializer *s, PyObject *obj)
{
	Py_UNICODE *text = PyUnicode_AS_UNICODE (obj);
	Py_ssize_t ii, len_text = PyUnicode_GET_SIZE (obj);
	
	/* Copy text to s->buffer, flushing as needed */
	for (ii = 0; ii < len_text; ii++)
	{
		if (s->buffer_size == FIXED_BUFFER_SIZE)
		{
			if (!(s->flush (s)))
			{ return 0; }
		}
		s->buffer[s->buffer_size++] = text[ii];
	}
	
	return 1;
}

static unsigned char
buffer_serializer_flush (Serializer *base)
{
	BufferSerializer *s = (BufferSerializer *)base;
	BufferList *lst = s->current_buffer;
	
	assert (base->buffer_size <= FIXED_BUFFER_SIZE);
	
	/* On the first flush, buffer pointers will be empty */
	if (lst)
	{
		lst->next = alloc_buffer_list();
		lst = lst->next;
	}
	
	else
	{
		lst = alloc_buffer_list();
		s->all_buffers = lst;
	}
	if (!lst)
	{ return 0; }
	
	s->current_buffer = lst;
	lst->buffer_size = base->buffer_size;
	memcpy (lst->buffer, base->buffer,
	        base->buffer_size * sizeof (Py_UNICODE));
	base->buffer_size = 0;
	
	return 1;
}

static BufferList *
alloc_buffer_list (void)
{
	BufferList *lst;
	if (!(lst = PyMem_Malloc (sizeof (BufferList))))
	{ return NULL; }
	
	lst->buffer_size = 0;
	lst->next = NULL;
	lst->buffer = PyMem_Malloc (sizeof (Py_UNICODE) * FIXED_BUFFER_SIZE);
	if (!lst->buffer)
	{ return NULL; }
	
	return lst;
}

static PyObject *
buffer_serializer_merge (BufferSerializer *s)
{
	size_t total = 0, offset = 0;
	BufferList *lst;
	Py_UNICODE *raw_merged;
	PyObject *merged;
	
	lst = s->all_buffers;
	while (lst)
	{
		total += lst->buffer_size;
		lst = lst->next;
	}
	
	if (!(raw_merged = PyMem_Malloc (sizeof (Py_UNICODE) * total)))
	{ return NULL; }
	
	lst = s->all_buffers;
	while (lst)
	{
		memcpy (raw_merged + offset, lst->buffer,
		        lst->buffer_size * sizeof (Py_UNICODE));
		offset += lst->buffer_size;
		lst = lst->next;
	}
	
	if (s->encoding)
	{
		merged = PyUnicode_Encode (raw_merged, total, s->encoding,
		                           "strict");
	}
	
	else
	{
		merged = PyUnicode_FromUnicode (raw_merged, total);
	}
	PyMem_Free (raw_merged);
	
	return merged;
}

static void
buffer_serializer_free (BufferSerializer *s)
{
	BufferList *lst = s->all_buffers;
	while (lst)
	{
		BufferList *next = lst->next;
		PyMem_Free (lst->buffer);
		PyMem_Free (lst);
		lst = next;
	}
}

static unsigned char
stream_serializer_flush (Serializer *base)
{
	PyObject *obj, *temp;
	StreamSerializer *s = (StreamSerializer*)base;
	
	if (s->encoding)
	{
		obj = PyUnicode_Encode (base->buffer, base->buffer_size,
		                        s->encoding, "strict");
	}
	
	else
	{
		obj = PyUnicode_FromUnicode(base->buffer, base->buffer_size);
	}
	if (!obj)
	{ return 0; }
	
	temp = PyObject_CallMethod (s->stream, "write", "O", obj);
	Py_DECREF (obj);
	if (!temp)
	{ return 0; }
	
	Py_DECREF (temp);
	base->buffer_size = 0;
	return 1;
}

/* }}} */

/* Python module setup {{{ */
static PyMethodDef jsonlib_methods[] = {
	{"read_impl", jsonlib_read, METH_VARARGS, NULL},
	{"write_impl", jsonlib_write, METH_VARARGS, NULL},
	{"dump_impl", jsonlib_dump, METH_VARARGS, NULL},
	{NULL, NULL, 0, NULL}
};

static struct PyModuleDef jsonlib_module = {
	PyModuleDef_HEAD_INIT,
	"_jsonlib",
	NULL,
	sizeof (ModuleState),
	jsonlib_methods
};

static PyObject *
from_import (const char *module_name, const char *attr_name)
{
	PyObject *module, *attr = NULL;
	if ((module = PyImport_ImportModule (module_name)))
	{
		attr = PyObject_GetAttrString (module, attr_name);
		Py_DECREF (module);
	}
	return attr;
}

PyMODINIT_FUNC
PyInit__jsonlib (void)
{
	PyObject *module;
	ModuleState *state;
	
	/* TODO: error checking */
	module = PyModule_Create (&jsonlib_module);
	state = PyModule_GetState (module);
	
	/* External types */
	state->Decimal = from_import ("decimal", "Decimal");
	state->UserString = from_import ("collections", "UserString");
	
	/* Constant strings */
	state->true_str = ascii_constant ("true");
	state->false_str = ascii_constant ("false");
	state->null_str = ascii_constant ("null");
	return module;
}
/* }}} */
