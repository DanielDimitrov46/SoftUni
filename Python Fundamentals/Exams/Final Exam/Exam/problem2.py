import re

number_of_text = int(input())
pattern = r"([!@#$%^&*()A-Za-z?`\-\+\|\"\:\/\.\,\_\}\{\>\<]+)>([0-9]{3})\|([a-z]{3})\|([A-Z]{3})\|([^>]|[^<]{3})<\1"
all = []
final_message = ''
for _ in range(number_of_text):
    current = input()
    final_message = ""
    result = re.findall(pattern,current)
    if result:
        for current_match in result:
            for number in range(1,5):
                final_message += current_match[number]
        if final_message:
            print(f"Password: {final_message}")
    else:
        print("Try another password!")