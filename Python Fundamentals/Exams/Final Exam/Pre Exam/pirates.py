from itertools import count

command = input().split("||")
register = {}

while command[0] != "Sail":
    city = command[0]
    population = int(command[1])
    gold = int(command[2])
    if not city in register:
        register[city] = [population, gold]
    else:
        register[city][0] += population
        register[city][1] += gold
    command = input().split("||")
command = input().split("=>")
while command[0] != "End":
    if command[0] == "Plunder":
        town = command[1]
        people = int(command[2])
        gold = int(command[3])
        print(f"{town} plundered! {gold} gold stolen, {people} citizens killed.")
        register[town][0] -= people
        register[town][1] -= gold
        if register[town][0] <= 0 or register[town][1] <= 0:
            del register[town]
            print(f"{town} has been wiped off the map!")
    elif command[0] == "Prosper":
        town = command[1]
        gold = int(command[2])
        if gold < 0:
            print("Gold added cannot be a negative number!")
        else:
            register[town][1] += gold
            print(f"{gold} gold added to the city treasury. {town} now has {register[town][1]} gold.")
    command = input().split("=>")
if register:
    print(f"Ahoy, Captain! There are {len(register)} wealthy settlements to go to:")
    for key,value in register.items():
        print(f"{key} -> Population: {value[0]} citizens, Gold: {value[1]} kg")
else:
    print("Ahoy, Captain! All targets have been plundered and destroyed!")