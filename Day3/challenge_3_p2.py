refresh = 0
lista = []
current = []
while True:
    rucksack = input()
    current.append(rucksack)
    if not rucksack or rucksack == "": break
    refresh += 1
    if refresh == 3:
        lista.append(current)
        current = []
        refresh = 0
points = 0
abc = "abcdefghijklmnopqrstuvwxyz"
for x in lista:
    used = []
    for i in x[0]:
        if i in x[1] and i in x[2] and i not in used:
            used.append(i)
            if i in abc:
                points += abc.index(i)+1
            else:
                points += abc.index(i.lower())+27
print(points)
