import string


def valid_index(index):
    if 0 <= index < len(main_string):
        return True


def replace(currentChar, newChar, main_string):
    if currentChar in main_string:
        main_string = main_string.replace(currentChar, newChar)
    return main_string


def cut(start_index, end_index, main_string):
    if valid_index(start_index) and valid_index(end_index):
        main_string = main_string[:start_index] + main_string[end_index + 1:]
        print(main_string)
        return main_string
    else:
        print("Invalid indices!")
        return main_string

def make_upper_lower(command, main_string):
    if command == "Upper":
        return main_string.upper()
    return main_string.lower()


def check(string, main_string):
    if string in main_string:
        print(f"Message contains {string}")
    else:
        print(f"Message doesn't contain {string}")
    return main_string


def sum(start_index, end_index, sum_values, main_string):
    if valid_index(start_index) and valid_index(end_index):
        result = main_string[start_index:end_index + 1]
        for currentChar in result:
            sum_values += ord(currentChar)
        print(sum_values)
        return sum_values
    else:
        print("Invalid indices!")
        return sum_values

main_string = input()
command = input().split()
while command[0] != "Finish":
    if command[0] == "Replace":
        currentChar = command[1]
        newChar = command[2]
        main_string = replace(currentChar,newChar,main_string)
        print(main_string)
    elif command[0] == "Cut":
        start_index = int(command[1])
        end_index = int(command[2])
        main_string = cut(start_index,end_index,main_string)
    elif command[0] == "Make":
        upper_lower = command[1]
        main_string = make_upper_lower(upper_lower,main_string)
        print(main_string)
    elif command[0] == "Check":
        string = command[1]
        main_string = check(string,main_string)
    elif command[0] == "Sum":
        sum_values = 0
        start_index = int(command[1])
        end_index = int(command[2])
        sum_values = sum(start_index,end_index,sum_values,main_string)
    command = input().split()
