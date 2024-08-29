from province import *

def main():
    json_file = 'provinces.json'
    provinces = read_provinces_from_json(json_file)
    
    new_province = enter_province_information()
    provinces.append(new_province)
    
    write_provinces_to_json(provinces, json_file)
    
    print("\nProvinces:")
    for province in provinces:
        print(f"ID: {province.id}, Name: {province.name}, Population: {province.population}, Capital: {province.capital}")

if __name__ == "__main__":
    main()