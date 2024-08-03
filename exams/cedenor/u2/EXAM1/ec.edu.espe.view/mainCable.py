def main():
    cable_manager = CableManager()

 
    cable1 = Cable(1, "Ethernet", 5.6, "Networking")
    cable2 = Cable(2, "HDMI", 3.2, "Video")
    cable3 = Cable(3, "Power", 1.2, "Electrical")

    cable_manager.add_cable(cable1)
    cable_manager.add_cable(cable2)
    cable_manager.add_cable(cable3)

    #JSON file
    cable_manager.save_to_json("cables.json")
    print("Cables SAVE.json")

    #  JSON file
    cable_manager.cables.clear()
    cable_manager.load_from_json("cables.json")
    print("Cables SAVE.json:")
    cable_manager.print_cables()

if __name__ == "__main__":
    main()