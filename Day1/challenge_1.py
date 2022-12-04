elfs = []
i = 2
name = 0
while i>0:
    current = [int(name)]
    while True:
        name = input()
        if name and name!="":
            current.append(int(name))
        else:
            break
    elfs.append(current)
    name = input()
    if not name:break
maximo = 0
elf = 0
lista = []
for x in range(len(elfs)):
    count = sum(elfs[x])
    lista.append(count)
lista = sorted(lista)
print(sum(lista[-3:]))
sure = [1,2,3,4]
print(lista[-3:])