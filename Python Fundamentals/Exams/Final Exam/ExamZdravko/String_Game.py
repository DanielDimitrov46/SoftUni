def process_commands(input_string):
    string = input_string

    while True:
        command = input()
        if command == "Done":
            break

        parts = command.split()
        action = parts[0]

        if action == "Change":
            char = parts[1]
            replacement = parts[2]
            string = string.replace(char, replacement)
            print(string)

        elif action == "Includes":
            substring = parts[1]
            print(substring in string)

        elif action == "End":
            substring = parts[1]
            print(string.endswith(substring))

        elif action == "Uppercase":
            string = string.upper()
            print(string)

        elif action == "FindIndex":
            char = parts[1]
            index = string.find(char)
            print(index)

        elif action == "Cut":
            start_index = int(parts[1])
            count = int(parts[2])
            cut_chars = string[start_index:start_index + count]
            print(cut_chars)


# Example input
input_string = input()
process_commands(input_string)
