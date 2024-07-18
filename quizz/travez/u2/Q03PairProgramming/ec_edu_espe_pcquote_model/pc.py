from sys import path
path.append("../Q03PairProgramming")

from typing import List
from ec_edu_espe_pcquote_model.processor import Processor
from ec_edu_espe_pcquote_model.ram import Ram
from ec_edu_espe_pcquote_model.video_card import VideoCard

class PC:
    def __init__(self):
        self.processor = None
        self.video_card = None
        self.ram = []
        
    def __repr__(self):
        return f"PC(processor={self.processor}, video_card={self.video_card}, ram={self.ram})"
    
    def is_complete(self):
        return self.processor and self.video_card and self.ram
    
    def summary(self):
        if not self.is_complete():
            missing_components = []
            if not self.processor:
                missing_components.append("processor")
            if not self.video_card:
                missing_components.append("video card")
            if not self.ram:
                missing_components.append("RAM")
            return f"Missing components: {', '.join(missing_components)}"
        
        total_ram = sum(ram.velocity for ram in self.ram)
        total_ram_price = sum(ram.price for ram in self.ram)
        total_price = self.processor.price + self.video_card.price + total_ram_price
        
        return f"""
        Processor: {self.processor.name} Cores: {self.processor.core} Price: ${self.processor.price}
        Video Card: {self.video_card.name} VRAM: {self.video_card.vram} Price: ${self.video_card.price}
        RAM: {', '.join(ram.name for ram in self.ram)} (Total: {total_ram} GB) Total RAM Price: ${total_ram_price}
        Total Price: ${total_price}
        """
