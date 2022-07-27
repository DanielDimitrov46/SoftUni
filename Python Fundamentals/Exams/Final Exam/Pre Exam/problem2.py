import re

text = input()

pattern = r"([#|])([A-Za-z ]+)\1([0-9]{2}/[0-9]{2}/[0-9]{2})\1([0-9]{1,5})\1"

match = re.findall(pattern, text)
total_calories = 0
days = 0
for current_match in match:
    product, date, calories = current_match[1], current_match[2], int(current_match[3])
    total_calories += calories

print(f"You have food to last you for: {int(total_calories/2000)} days!")
for current_match in match:
    product, date, calories = current_match[1], current_match[2], int(current_match[3])
    print(f"Item: {product}, Best before: {date}, Nutrition: {calories}")
