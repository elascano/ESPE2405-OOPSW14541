from datetime import datetime
class building_controller:
    @staticmethod
    def calculate_age(year):
        age = datetime.now().year - year
        return age

building_controller = building_controller()