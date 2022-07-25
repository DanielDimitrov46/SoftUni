import re

pattern = ">>([A-Za-z]+)<<(\d+\.?\d*)!(\d+)"
total_cost = 0
bought_furniture = []
command = input()

while command != "Purchase":
    match = re.search(pattern,command)
    if match:
        furniture,price, quantity = match.groups()
        bought_furniture.append(furniture)
        total_cost += float(price)*int(quantity)
    command = input()
print("Bought furniture:")
for furniture in bought_furniture:
    print(furniture)
print(f"Total money spend: {total_cost:.2f}")