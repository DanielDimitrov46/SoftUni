# # 03. Plant Discovery
# def create_plants_data(plants, number):
#     for _ in range(number):
#         data = input().split("<->")
#         name_of_plant, rarity = data[0], int(data[1])
#         if name_of_plant not in plants:
#             plants[name_of_plant] = {"rarity": rarity, "rating": []}
#         else:
#             plants[name_of_plant]["rarity"] += rarity
#     return plants
#
#
# def additional_plants_data(plants):
#     while True:
#         command = input().split(": ")
#
#         if command[0] == "Exhibition":
#             break
#
#         data = command[1].split(" - ")
#         type_of_command = command[0]
#         plant = data[0]
#
#         if plant not in plants:
#             print('error')
#             continue
#
#         if type_of_command == 'Rate':
#             rating = int(data[1])
#             plants[plant]["rating"].append(rating)
#         elif type_of_command == 'Update':
#             new_rarity = int(data[1])
#             plants[plant]["rarity"] = new_rarity
#         elif type_of_command == 'Reset':
#             plants[plant]['rating'].clear()
#     return plants
#
#
# def print_function(plants):
#     print('Plants for the exhibition:')
#
#     for dict_el in plants:
#         if len(plants[dict_el]['rating']) > 0 and sum(plants[dict_el]['rating']) > 0:
#             average_rating = sum(plants[dict_el]['rating']) / len(plants[dict_el]['rating'])
#         else:
#             average_rating = 0
#         rarity = plants[dict_el]['rarity']
#         print(f'- {dict_el}; Rarity: {rarity}; Rating: {average_rating:.2f}')
#
#
# def plant_discovery(number):
#     plants = {}
#
#     create_plants_data(plants, number)
#     additional_plants_data(plants)
#     print_function(plants)
#
#
# n = int(input())
# plant_discovery(n)

# 1/2
number_of_plants = int(input())
register = {}
for _ in range(number_of_plants):
    current_plant = input().split("<->")
    plant_name, rarity = current_plant[0], int(current_plant[1])
    if plant_name in register:
        register[plant_name]['rarity'] += 1
    else:
        register[plant_name] = {'rarity': rarity, 'rating': []}

command = input()

while command != "Exhibition":
    real_command, rest = command.split(": ")
    data = rest.split(" - ")
    plant = data[0]
    if plant not in register:
        print('error')
        command = input()
        continue
    if real_command == "Rate":
        rating = int(data[1])
        register[plant]['rating'].append(rating)
    elif real_command == "Update":
        new_rarity = data[1]
        register[plant]['rarity'] = new_rarity
    elif real_command == "Reset":
        register[plant]['rating'].clear()

    command = input()

print('Plants for the exhibition:')
for dict_el in register:
    if len(register[dict_el]['rating']) > 0 and sum(register[dict_el]['rating']) > 0:
        average_rating = sum(register[dict_el]['rating']) / len(register[dict_el]['rating'])
    else:
        average_rating = 0
    rarity = register[dict_el]['rarity']
    print(f'- {dict_el}; Rarity: {rarity}; Rating: {average_rating:.2f}')