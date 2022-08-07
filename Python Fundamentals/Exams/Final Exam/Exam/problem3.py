# possible_messages = int(input())
# register = {}  # sent index 1, received index 2
#
# command = input()
# while "Statistics" not in command:
#     command = command.split("=")
#     if command[0] == "Add":
#         username = command[1]
#         sent = int(command[2])
#         received = int(command[3])
#         if username not in register:
#             register[username] = [sent, received]
#         if register[username][0] + register[username][1] >= possible_messages:
#             del register[username]
#             print(f"{username} reached the capacity!")
#     elif command[0] == "Message":
#         sender = command[1]
#         receiver = command[2]
#         if sender in register and receiver in register:
#             register[sender][0] += 1
#             register[receiver][1] += 1
#         if register[sender][0] + register[sender][1] >= possible_messages:
#             del register[sender]
#             print(f"{sender} reached the capacity!")
#         elif register[receiver][0] + register[receiver][1] >= possible_messages:
#             del register[receiver]
#             print(f"{receiver} reached the capacity!")
#     elif command[0] == "Empty":
#         username = command[1]
#         if username in register:
#             del register[username]
#         if username == "All":
#             del register
#             register = {}
#     command = input()
#
# print(f"Users count: {len(register)}")
# for key, value in register.items():
#     print(f"{key} - {sum(value)}")

possible_messages = int(input())
command = input()
register = {}


def add(username, sent, received, register):
    if username not in register:
        register[username] = [sent, received]
    return register


def message(sender, receiver, register):
    if sender in register and receiver in register:
        register[sender][0] += 1
        if register[sender][0] + register[sender][1] >= possible_messages:
            del register[sender]
            print(f"{sender} reached the capacity!")
        register[receiver][1] += 1
        if register[receiver][0] + register[receiver][1] >= possible_messages:
            del register[receiver]
            print(f"{receiver} reached the capacity!")
    return register


def empty(username, register):
    if username in register:
        del register[username]
    if username == "All":
        register.clear()
    return register


while True:
    if "Statistics" in command:
        break
    command = command.split("=")
    username = command[1]
    if command[0] == "Add":
        sent = int(command[2])
        received = int(command[3])
        register = add(username,sent,received,register)
    elif command[0] == "Message":
        receiver = command[2]
        register = message(username,receiver,register)
    elif command[0] == "Empty":
        register = empty(username,register)
    command = input()
print(f"Users count: {len(register)}")
for key,value in register.items():
    print(f"{key} - {sum(value)}")
