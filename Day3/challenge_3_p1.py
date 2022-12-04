points = 0
while True:
    rucksack = input()
    if not rucksack or rucksack=="":break
    abc = "abcdefghijklmnopqrstuvwxyz"
    half_point = len(rucksack)//2
    first = rucksack[:half_point]
    second = rucksack[half_point:]
    for x in first:
        if x in second:
            match = x
            break
    if x in abc:
        points += abc.index(x)+1
    else:
        points += abc.index(x.lower())+27
print(points)

