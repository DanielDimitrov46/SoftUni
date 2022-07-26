import re
text = input()

pattern = r"([#|])([A-Za-z ]+)\1([0-9]{2}/[0-9]{2}/[0-9]{2})\1([0-9]{1,5}\1)"

match = re.compile(pattern)