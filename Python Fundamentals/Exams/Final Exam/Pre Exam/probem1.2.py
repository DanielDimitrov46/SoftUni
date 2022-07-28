import re

text = input()
pattern = r"([=/])([A-Z][A-Za-z]{2,})\1"
all_destinations = []
total_points = 0

match = re.findall(pattern, text)

for current in match:
    destination = current[1]
    total_points += len(destination)
    all_destinations.append(destination)
print(f"Destinations: {', '.join(all_destinations)}")
print(f'Travel Points: {total_points}')