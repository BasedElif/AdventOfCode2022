name = ""
stacks = []
while True:
    name = input()
    if not name:
        break
    else:
        stacks.append(list(name)[::-1])
instr = []
while True:
    name = input()
    if not name:
        break
    else:
        current = []
        for x in name.split(" "):
            if x.isdigit():current.append(int(x))
        instr.append(current)
for x in instr:
    for i in stacks[x[1]-1][-x[0]:]:
        stacks[x[2]-1].append(i)
    stacks[x[1]-1] = stacks[x[1]-1][:-x[0]]
output = ""
for x in stacks:
    output+=x[-1]
print(output)