key = input()
command = input()

while command != "Generate":
    current_command = command.split(">>>")

    if current_command[0] == "Contains":
        substring = current_command[1]
        if substring in key:
            print(f'{key} contains {substring}')
        else:
            print('Substring not found!')
    elif current_command[0] == "Flip":
        upper_lower = current_command[1]
        start_index = int(current_command[2])
        end_index = int(current_command[3])
        if upper_lower == "Upper":
            key = key[:start_index] + (key[start_index:end_index]).upper() + key[end_index:]
        else:
            key = key[:start_index] + (key[start_index:end_index]).lower() + key[end_index:]
        print(key)
    elif current_command[0] == "Slice":
        start_index = int(current_command[1])
        end_index = int(current_command[2])
        key = key[:start_index]+key[end_index:]
        print(key)
    command = input()

print(f"Your activation key is: {key}")
