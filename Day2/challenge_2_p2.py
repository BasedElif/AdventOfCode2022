points = 0
while True:
    name = input()
    if not name or name=="":break
    name = name.split(" ")
    op = name[0]
    pl = name[1]
    if op == "A":
        if pl == "X":
            points+=3
        elif pl == "Y":
            points+=4
        else:
            points+=8
    elif op == "B":
        if pl == "X":
            points+=1
        elif pl == "Y":
            points+=5
        else:
            points+=9
    elif op == "C":
        if pl == "X":
            points+=2
        elif pl == "Y":
            points+=6
        else:
            points+=7
print(points)