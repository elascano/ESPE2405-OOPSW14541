from sys import path
path.append("../Q03PairProgramming")

from ec_edu_espe_pcquote_model.processor import Processor
from ec_edu_espe_pcquote_model.pc import PC
from ec_edu_espe_pcquote_model.ram import Ram
from ec_edu_espe_pcquote_model.video_card import VideoCard

class Quoter:
    
    @staticmethod
    def add_processor(pc: PC, processor: Processor):
        pc.processor = processor
        
    @staticmethod
    def add_video_card(pc: PC, video_card: VideoCard):
        pc.video_card = video_card

    @staticmethod
    def add_ram(pc: PC, ram: Ram):
        if len(pc.ram) < 4:
            pc.ram.append(ram)
        else:
            print("RAM limit reached.")
