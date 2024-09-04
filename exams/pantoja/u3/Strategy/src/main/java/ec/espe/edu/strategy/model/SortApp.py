class SortApp:
    def __init__(self, unordered=None, ordered=None):
        if unordered is None:
            unordered = [0] * 10
        if ordered is None:
            ordered = [0] * 10

        self.unordered = unordered
        self.ordered = ordered

    def get_unordered(self):
        return self.unordered

    def set_unordered(self, unordered):
        self.unordered = unordered

    def get_ordered(self):
        return self.ordered

    def set_ordered(self, ordered):
        self.ordered = ordered

