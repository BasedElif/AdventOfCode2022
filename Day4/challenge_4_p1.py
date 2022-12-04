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
    if ( first0 >= second0 and first1 <= second1 ) or ( first0 <= second0 and first1 >= second1 ):
        counter += 1
print(counter)