import sys
from PyQt5.QtWidgets import QApplication, QMainWindow, QMessageBox
from PyQt5.uic import loadUi
from pymongo import MongoClient
import sys
import os

sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from ec_edu_sortingapp_controller.sorting_context import SortingContext
import numpy as np


class SortingApp(QMainWindow):
    def __init__(self):
        super(SortingApp, self).__init__()
        loadUi("ec_edu_sortingapp_view/sorting_app.ui", self) 

        self.sortingContext = SortingContext()
        self.btnSort.clicked.connect(self.sort_data)

        self.mongo_client = MongoClient("mongodb+srv://canarte:canarte@cluster0.devwm9s.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0")
        self.database = self.mongo_client["oop"]
        self.collection = self.database["strategyCañarte"]

    def sort_data(self):
        try:
    
            input_text = self.txtDataInput.toPlainText().split(',')

            data = np.array([int(x.strip()) for x in input_text])

            sorted_data = self.sortingContext.sort(data)

            self.txtDataOutput.setPlainText(str(sorted_data.tolist()))

            self.save_to_mongodb(data.tolist(), sorted_data.tolist())

        except ValueError:
            QMessageBox.critical(self, "Invalid Input", "Please enter valid numbers separated by commas.", QMessageBox.Ok)

    def save_to_mongodb(self, original_data, sorted_data):
        document = {
            "original_data": original_data,
            "sorted_data": sorted_data
        }
        self.collection.insert_one(document)
        print("Data saved to MongoDB.")

def main():
    app = QApplication(sys.argv)
    window = SortingApp()
    window.show()
    sys.exit(app.exec_())

if __name__ == "__main__":
    main()

