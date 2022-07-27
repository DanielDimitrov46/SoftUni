reg = {}
line = input().split()
reg[line[0]] = [line[1],line[2]]
print(reg)
reg[line[0]][0] = "something"
print(reg)