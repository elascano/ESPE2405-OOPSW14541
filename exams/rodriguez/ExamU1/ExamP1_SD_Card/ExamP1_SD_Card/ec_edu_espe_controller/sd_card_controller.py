from ec_edu_espe_model.sd_card import SDCard
from ec_edu_espe_utils.json_util import write_json, read_json

class SDCardController:
    def __init__(self, file_path):
        self.file_path = file_path

    def create_sd_card(self, id, capacity, brand, speed_class):
        sd_card = SDCard(id, capacity, brand, speed_class)
        data = self._read_all_sd_cards()
        data.append(sd_card.to_dict())
        write_json(self.file_path, data)

    def get_all_sd_cards(self):
        return [SDCard.from_dict(item) for item in self._read_all_sd_cards()]

    def _read_all_sd_cards(self):
        try:
            return read_json(self.file_path)
        except FileNotFoundError:
            return []