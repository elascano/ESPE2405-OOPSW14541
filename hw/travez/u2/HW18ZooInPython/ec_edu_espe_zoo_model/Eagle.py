from datetime import datetime
from Bird import Bird


# Ismael Travez, The Java Bandits, DCCO-ESPE

class Eagle(Bird):
    def __init__(self, id, description, date_onborn, gender, number_of_bones, cage):
        super().__init__(id, description, date_onborn, gender, number_of_bones, cage)

    def feed(self, food):
        raise NotImplementedError("Not supported yet.")


