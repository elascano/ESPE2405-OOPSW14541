import sys
import json
import numpy as np
from PyQt5 import QtWidgets, uic
from pymongo import MongoClient
from pymongo.errors import MongoException
from sorting_context import SortingContext
from sort_app import SortApp
from db_manager import DbManager

class FrmSortApp(QtWidgets.QMainWindow):
    dbManager = None
    sortApp = None

    def __init__(self):
        super(FrmSortApp, self).__init__()
        uic.loadUi('FrmSortApp.ui', self)  # Load the UI file created with Qt Designer
        self.connectMongoDB()
        self.initUI()

    def initUI(self):
        self.btnSaveAndExit.clicked.connect(self.btnSaveAndExitActionPerformed)

    def btnSaveAndExitActionPerformed(self):
        uri = "mongodb+srv://cdpantoja2:pantoja@cluster0.uqhoeh0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
        mongo_client = MongoClient(uri)
        database = mongo_client["ExamPracticeU3"]

        numbers_input = self.Numbers.text()
        data = self.parseInputNumbers(numbers_input)

        if data is not None:
            sc = SortingContext()
            unordered = np.copy(data)
            ordered = np.copy(data)
            ordered = sc.sort(ordered)

            self.txtOrdered.setText(str(list(ordered)))

            self.saveDataToMongoDB(data)

            self.close()

    def parseInputNumbers(self, input_text):
        try:
            input_numbers = [int(x.strip()) for x in input_text.split(',')]
            data = np.array(input_numbers)
            return data
        except ValueError:
            print("Invalid input: Please enter comma-separated numbers.")
            return None

    def saveDataToMongoDB(self, data):
        if self.sortApp is None:
            self.sortApp = SortApp()

        self.sortApp.set_unordered(np.copy(data))
        self.sortApp.set_ordered(data)

        json_sort_app = json.dumps(self.sortApp.__dict__)

        try:
            collection = self.dbManager.getDatabase().get_collection("Numbers")
            document = json.loads(json_sort_app)
            collection.insert_one(document)
            print("Datos guardados correctamente en la base de datos.")
        except MongoException as me:
            print(f"Error al intentar guardar los datos: {me}")

    @staticmethod
    def connectMongoDB():
        FrmSortApp.dbManager = DbManager()
        uri = "mongodb+srv://cdpantoja2:pantoja@cluster0.uqhoeh0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
        dataBaseName = "ExamPracticeU3"
        FrmSortApp.dbManager.connect(uri, dataBaseName)

if __name__ == "__main__":
    app = QtWidgets.QApplication(sys.argv)
    window = FrmSortApp()
    window.show()
    sys.exit(app.exec_())

