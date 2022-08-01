from unittest import result

number_of_cars = int(input())
register = {}

for _ in range(number_of_cars):
    message = input().split("|")
    car, mileage, fuel = message[0], int(message[1]), int(message[2])
    register[car] = [mileage, fuel]
command = input()

while command != "Stop":
    command = command.split(" : ")
    car = command[1]
    if command[0] == "Drive":
        distance = int(command[2])
        fuel = int(command[3])
        if fuel <= register[car][1]:
            register[car][0] += distance
            register[car][1]-=fuel
            print(f"{car} driven for {distance} kilometers. {fuel} liters of fuel consumed.")
            if register[car][0] >= 100000:
                print(f'Time to sell the {car}!')
                del register[car]
        else:
            print('Not enough fuel to make that ride')
    elif command[0] == "Refuel":
        fuel = int(command[2])
        available_fuel = register[car][1]
        if available_fuel+fuel >75:
            fuel = 75-register[car][1]
            register[car][1] = 75
        else:
            register[car][1]+=fuel

        print(f"{car} refueled with {fuel} liters")
    elif command[0] == "Revert":
        distance = int(command[2])
        register[car][0]-=distance
        if register[car][0]>10000:
            print(f"{car} mileage decreased by {distance} kilometers")
        else:
            register[car][0] = 10000
    command = input()

for key,value in register.items():
    print(f"{key} -> Mileage: {value[0]} kms, Fuel in the tank: {value[1]} lt.")