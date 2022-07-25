encrypted_message = input()

command = input()


def move_string(number_of_letters, encrypted_message):
    return encrypted_message[number_of_letters:] + encrypted_message[:number_of_letters]


def insert_string(index, value, encrypted_message):
    return encrypted_message[:index] + value + encrypted_message[index:]


def change_all(substring, replacement, encrypted_message):
    return encrypted_message.replace(substring, replacement)


while command != "Decode":
    all_things = command.split("|")
    if all_things[0] == "Move":
        number = int(all_things[1])
        encrypted_message = move_string(number,encrypted_message)
    elif all_things[0] == "Insert":
        index= int(all_things[1])
        value = all_things[2]
        encrypted_message = insert_string(index,value,encrypted_message)
    else:
        substring,replacement = all_things[1],all_things[2]
        encrypted_message = change_all(substring,replacement,encrypted_message)
    command = input()

print(f"The decrypted message is: {encrypted_message}")
