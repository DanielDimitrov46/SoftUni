concealed_message = input()


def insert_space(index, string):
    return string[:index] + " " + string[index:]  # possible +1


def reverse(substring, string, flag):
    if substring in string:
        word_find = string.find(substring)
        string = string[:word_find] + "" + string[word_find + (len(substring)):]
        string += substring[::-1]
        flag = True
        return string,flag
    else:
        flag = False
        print("error")
        return string,flag


def change_all(substring, replacement, string):
    string = string.replace(substring, replacement)
    return string


command = input()

while command != "Reveal":
    command = command.split(":|:")
    if command[0] == "InsertSpace":
        index = int(command[1])
        concealed_message = insert_space(index,concealed_message)
    elif command[0] == "Reverse":
        substring = command[1]
        flag = False
        concealed_message,flag = reverse(substring,concealed_message,flag)
        if flag:
            print(concealed_message)
            command = input()
            continue
        else:
            command = input()
            continue
    elif command[0] == "ChangeAll":
        substring,replacement = command[1],command[2]
        concealed_message = change_all(substring,replacement,concealed_message)
    print(concealed_message)
    command = input()
print(f'You have a new text message: {concealed_message}')