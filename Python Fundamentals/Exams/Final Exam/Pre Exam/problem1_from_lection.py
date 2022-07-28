main_string = input()
command = input().split()


def take_odd(main_string):
    main_string = ("".join([main_string[x] for x in range(len(main_string)) if x % 2 != 0]))
    return main_string


def cut_string(index, length, main_string):
    return main_string[:index] + main_string[index + length:]


def substitute_string(substring, substitute, main_string,flag):
    if substring in main_string:
        main_string = main_string.replace(substring, substitute)
        flag = True
        return main_string, flag
    else:
        print("Nothing to replace!")
        flag = False
        return main_string, flag


while command[0] != "Done":
    if command[0] == "TakeOdd":
        main_string = take_odd(main_string)
    elif command[0] == "Cut":
        index, length = int(command[1]), int(command[2])
        main_string = cut_string(index, length, main_string)
    elif command[0] == "Substitute":
        flag = False
        substring, substitute = command[1], command[2]
        main_string,flag = substitute_string(substring,substitute,main_string, flag)
        if flag:
            print(main_string)
            command = input().split()
            continue
        else:
            command = input().split()
            continue
    print(main_string)
    command = input().split()

print(f"Your password is: {main_string}")
