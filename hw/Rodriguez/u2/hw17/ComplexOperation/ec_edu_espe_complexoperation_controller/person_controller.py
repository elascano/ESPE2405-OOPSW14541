# person_controller.py
from datetime import datetime, date

class PersonController:
    @staticmethod
    def compute_age_in_days(birth_date):
        today = date.today()
        period = today - birth_date
        return period.days

    @staticmethod
    def compute_age_in_years(birth_date):
        today = date.today()
        return today.year - birth_date.year - ((today.month, today.day) < (birth_date.month, birth_date.day))
