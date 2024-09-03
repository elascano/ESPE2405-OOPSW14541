class USTax:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(USTax, cls).__new__(cls)
        return cls._instance

    def calculate_sales_tax(self, sale_amount):
        tax_rate = 9.38 / 100
        return sale_amount * tax_rate

    def calculate_tax_plus_sale(self, sale_amount, tax):
        sale_total = sale_amount + tax
        return sale_total
