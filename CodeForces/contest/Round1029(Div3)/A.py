css = int(input())
for _ in range(css):
    numDoors, time = [int(num) for num in input().split()]
    doors = input().split()
    pos = 0
    timerActive = False
    result = "YES"
    while pos < numDoors:
        if doors[pos] == '1':
            timerActive = True
            # print(time, "time")
            if time < 1: 
                result = "NO"
                break
        if timerActive: time -= 1
        pos += 1
    print(result)
            