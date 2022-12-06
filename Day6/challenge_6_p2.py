device = input()
str = ""
index = 1
for x in range(len(device)):
    if device[x] in str:
        str = str[str.index(device[x])+1:] + device[x]
    else:
        str+=device[x]
    if len(str)==14:
        index += x
        break

print(index)