class DataValidation:
    @staticmethod
    def validateLicensePlate(license_plate):
        return isinstance(license_plate, str) and len(license_plate) == 7

    @staticmethod
    def validateYear(year):
        import datetime
        current_year = datetime.datetime.now().year
        return 1886 <= year <= current_year

    @staticmethod
    def validatePrice(price):
        return price > 0
