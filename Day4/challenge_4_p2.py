counter = 0
while True:
    intervals = input()
    if not intervals or intervals == "":break
    first,second = map(str,intervals.split(","))
    first = first.split("-")
    second = second.split("-")
    first0 = int(first[0])
    second0 = int(second[0])
    first1 = int(first[1])
    second1 = int(second[1])
    bool = False
    for x in range(first0,first1+1):
        for y in range(second0,second1+1):
            if x == y:
                bool = True
                break
        if bool:break
    if bool:counter+=1
print(counter)