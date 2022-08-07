text_string = input()
numbers_list = []
letter = ""
take_list = []
skip_list = []
result = ""
for current in text_string:
    if current.isdigit():
        numbers_list.append(int(current))
    else:
        letter += current

for index, value in enumerate(numbers_list):
    if index % 2 == 0:
        take_list.append(value)
    else:
        skip_list.append(value)
for i, n in zip(take_list, skip_list):
    if i == 0:
        letter = letter[n:]
    elif i != 0:
        result = result + letter[:i]
        letter = letter[n + i:]

print(result)
