from PyQt5.QtWidgets import QApplication, QMainWindow, QMessageBox
from PyQt5.uic import loadUi
import sys

class SortingContext:
    def sort(self, data):
        return sorted(data)

class SortingApp(QMainWindow):
    def __init__(self):
        super(SortingApp, self).__init__()
        loadUi('ec_edu_sortingapp_view/sorting_app.ui', self) 

        self.sorting_context = SortingContext()

       
        self.btnSort.clicked.connect(self.sort_data)

    def sort_data(self):
        try:
            input_text = self.txtDataInput.toPlainText().strip()
            data = list(map(int, input_text.split(',')))

            sorted_data = self.sorting_context.sort(data)

            self.txtDataOutput.setPlainText(', '.join(map(str, sorted_data)))
        except ValueError:
            QMessageBox.critical(self, "Invalid Input", "Please enter valid numbers separated by commas.")

if __name__ == "__main__":
    app = QApplication(sys.argv)
    window = SortingApp()
    window.show()
    sys.exit(app.exec_())
