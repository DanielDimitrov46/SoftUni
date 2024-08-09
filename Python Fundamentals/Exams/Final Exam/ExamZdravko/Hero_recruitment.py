def enroll_hero(heroes, hero_name):
    if hero_name not in heroes:
        heroes[hero_name] = []
    else:
        print(f"{hero_name} is already enrolled.")


def learn_spell(heroes, hero_name, spell_name):
    if hero_name in heroes:
        if spell_name not in heroes[hero_name]:
            heroes[hero_name].append(spell_name)
        else:
            print(f"{hero_name} has already learnt {spell_name}.")
    else:
        print(f"{hero_name} doesn't exist.")


def unlearn_spell(heroes, hero_name, spell_name):
    if hero_name in heroes:
        if spell_name in heroes[hero_name]:
            heroes[hero_name].remove(spell_name)
        else:
            print(f"{hero_name} doesn't know {spell_name}.")
    else:
        print(f"{hero_name} doesn't exist.")


def print_heroes(heroes):
    print("Heroes:")
    for hero, spells in (heroes.items()):
        print(f"== {hero}: {', '.join(spells)}")


# Initialize dictionary to store heroes and their spellbooks
heroes = {}

# Process input commands
while True:
    command = input().split()
    if command[0] == "End":
        break

    action = command[0]
    hero_name = command[1]

    if action == "Enroll":
        enroll_hero(heroes, hero_name)
    elif action == "Learn":
        spell_name = command[2]
        learn_spell(heroes, hero_name, spell_name)
    elif action == "Unlearn":
        spell_name = command[2]
        unlearn_spell(heroes, hero_name, spell_name)

# Print heroes and their spellbooks
print_heroes(heroes)
