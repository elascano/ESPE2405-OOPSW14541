class Gender:
    genders = [
        (1, "Rock"),
        (2, "Pop"),
        (3, "Alternative"),
        (4, "Rap"),
        (5, "Electronic"),
        (6, "Reggaeton"),
        (7, "Salsa"),
        (8, "Bolero"),
        (9, "Jazz"),
        (10, "Folk")
    ]
    
    @staticmethod
    def print_genders():
        print("{:<5} {:<15}".format("ID", "Nombre del género"))
        print("-" * 20)
        for id, name in Gender.genders:
            print("{:<5} {:<15}".format(id, name))
