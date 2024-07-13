from datetime import datetime, timedelta

class PersonController:
    @staticmethod
    def compute_age_in_days(birth_date):
        today = datetime.now().date()
        days = (today - birth_date).days
        return days

    @staticmethod
    def compute_age_in_years(birth_date):
        today = datetime.now().date()
        years = today.year - birth_date.year - ((today.month, today.day) < (birth_date.month, birth_date.day))
        return years
