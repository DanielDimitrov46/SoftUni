def heroes(number_of_heroes, register):
    for _ in range(number_of_heroes):
        current_hero = input().split()
        hero_name = current_hero[0]
        health = int(current_hero[1])
        mana = int(current_hero[2])
        register[hero_name] = [health, mana]
    return register


def commands_for_heroes(register):
    command = input().split(" - ")
    while command[0] != "End":
        hero_name = command[1]
        if command[0] == "CastSpell":
            mp = int(command[2])
            spell_name = command[3]
            if register[hero_name][1] >= mp:
                register[hero_name][1] -= mp
                print(f"{hero_name} has successfully cast {spell_name} and now has {register[hero_name][1]} MP!")
            else:
                print(f"{hero_name} does not have enough MP to cast {spell_name}!")
        elif command[0] == "TakeDamage":
            damage = int(command[2])
            attacker = command[3]
            register[hero_name][0] -= damage
            if register[hero_name][0] > 0:
                print(
                    f"{hero_name} was hit for {damage} HP by {attacker} and now has {register[hero_name][0]} HP left!")
            else:
                del register[hero_name]
                print(f"{hero_name} has been killed by {attacker}!")
        elif command[0] == "Recharge":
            amount = int(command[2])
            if register[hero_name][1] + amount > 200:
                amount = register[hero_name][1] - 200
                register[hero_name][1] = 200
            else:
                register[hero_name][1] += amount
            print(f"{hero_name} recharged for {abs(amount)} MP!")
        elif command[0] == "Heal":
            health = int(command[2])
            if register[hero_name][0] + health > 100:
                health = register[hero_name][0] - 100
                register[hero_name][0] = 100
            else:
                register[hero_name][0] += health
            print(f"{hero_name} healed for {abs(health)} HP!")
        command = input().split(" - ")
    return register


def print_things(register):
    for key, value in register.items():
        print(f"{key}\n HP: {value[0]}\n MP: {value[1]}")


def everything(number_of_heroes, register):
    heroes(number_of_heroes, register)
    commands_for_heroes(register)
    print_things(register)


number_of_heroes = int(input())
register = {}
everything(number_of_heroes, register)
