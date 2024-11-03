import json
from typing import List
from sort_app import SortApp  # Assuming SortApp is defined in a module named sort_app

class SortAppController:

    @staticmethod
    def load_sort_app(jsons: List[str]) -> List[SortApp]:
        sorts = []
        for json_str in jsons:
            sorts.append(SortAppController.json_to_sort_app(json_str))
        return sorts

    @staticmethod
    def json_to_sort_app(json_str: str) -> SortApp:
        unordered = [0] * 7  # Initialize unordered array with 7 elements
        ordered = [0] * 7    # Initialize ordered array with 7 elements

        sort_app = SortApp(unordered, ordered)

        sort_app = json.loads(json_str, object_hook=lambda d: SortApp(**d))
        
        return sort_app

