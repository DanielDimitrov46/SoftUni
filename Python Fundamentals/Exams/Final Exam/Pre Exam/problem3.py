number_of_pieces = int(input())
register = {}

for current_piece in range(number_of_pieces):
    song, composer, key = input().split("|")
    register[song] = [composer, key]
    print(register)

command = input()
while command != "Stop":
    current_command = command.split("|")
    if current_command[0] == "Add":
        current_command.remove(current_command[0])
        piece, composer, key = current_command
        if piece in register:
            print(f"{piece} is already in the collection!")
            command = input()
            continue
        register[piece] = [composer, key]
        print(f"{piece} by {composer} in {key} added to the collection!")
    elif current_command[0] == "Remove":
        piece = current_command[1]
        if piece in register:
            del register[piece]
            print(f"Successfully removed {piece}!")
        else:
            print(f"Invalid operation! {piece} does not exist in the collection.")
    elif current_command[0] == "ChangeKey":
        current_command.remove(current_command[0])
        piece, new_key = current_command
        if piece in register:
            register[piece][1] = new_key
            print(f"Changed the key of {piece} to {new_key}!")
        else:
            print(f"Invalid operation! {piece} does not exist in the collection.")
    command = input()

for key,value in register.items():
    print(f"{key} -> Composer: {value[0]}, Key: {value[1]}")