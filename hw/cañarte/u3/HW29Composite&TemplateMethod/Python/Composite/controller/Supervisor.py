import sys
import os
# Saray Cañarte, codecreators, DCCO - ESPE

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from controller.Employee import Employee


class Supervisor(Employee):
    def __init__(self, name="not assigned yet"):
        super().__init__(name, "Supervisor")
        self.direct_reports = []

    def state_name(self):
        super().state_name()
        for report in self.direct_reports:
            report.state_name()

    def add(self, employee):
        self.direct_reports.append(employee)

    def remove(self, employee):
        self.direct_reports.remove(employee)
