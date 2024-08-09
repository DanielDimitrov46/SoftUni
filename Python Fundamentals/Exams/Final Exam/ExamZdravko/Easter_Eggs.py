import re


def find_valid_eggs(text):
    valid_eggs = []
    egg_pattern = r'[#@]+([a-z]{3,})[^a-z\d]*?/(\d+)/'
    matches = re.findall(egg_pattern, text)

    for match in matches:
        color = match[0]
        amount = match[1]
        # Check if color and amount meet conditions
        if len(color) >= 3 and color.isalpha() and amount.isdigit():
            valid_eggs.append((color, amount))

    return valid_eggs


def print_valid_eggs(valid_eggs):
    for color, amount in valid_eggs:
        print(f"You found {amount} {color} eggs!")


# Example input
input_text = input()
valid_eggs = find_valid_eggs(input_text)
print_valid_eggs(valid_eggs)
