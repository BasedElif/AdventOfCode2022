points = 0
while True:
    name = input()
    if not name or name=="":break
    name = name.split(" ")
    op = name[0]
    pl = name[1]
    if op == "A":
        if pl == "X":
            points+=4
        elif pl == "Y":
            points+=8
        else:
            points+=3
    elif op == "B":
        if pl == "X":
            points+=1
        elif pl == "Y":
            points+=5
        else:
            points+=9
    elif op == "C":
        if pl == "X":
            points+=7
        elif pl == "Y":
            points+=2
        else:
            points+=6
print(points)
