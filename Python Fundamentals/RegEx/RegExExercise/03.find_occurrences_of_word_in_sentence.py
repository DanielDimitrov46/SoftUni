import re

line = input()
searched_word = input()
pattern = fr"\b{searched_word}\b"
result = re.findall(pattern,line,flags=re.I)
print(len(result))
