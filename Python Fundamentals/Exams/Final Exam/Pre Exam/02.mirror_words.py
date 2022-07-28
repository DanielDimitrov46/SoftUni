import re
text = input()

pattern = r"([@#]{1})([A-Za-z]{3,})\1{2}([A-Za-z]{3,})\1{1}"

result = re.findall(pattern,text)
list_result = []
specified_pair = {}


for current_pair in result:
    first_string = current_pair[1]
    second_string = current_pair[2]
    if first_string == second_string[::-1]:
        list_result.append(f"{first_string} <=> {second_string}")

if result:
    print(f"{len(result)} word pairs found!")
    if list_result:
        print("The mirror words are:")
        print(*list_result, sep=", ")
    else:
        print("No mirror words!")
else:
    print("No word pairs found!")
    print("No mirror words!")