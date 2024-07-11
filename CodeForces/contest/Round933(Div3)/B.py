css = int(input())
for _ in range(css):
    size = int(input())
    arr = [int(x) for x in input().split()]
    result = True
    while sum(arr) > 0:
        maxElement = max(arr)
        maxIndex = arr.index(maxElement)
        if maxIndex in [0, size - 1]:
            result = False
            break
        arr[maxIndex] -= 2
        arr[maxIndex - 1] -= 1
        arr[maxIndex + 1] -= 1
        if(arr[maxIndex] < 0 or arr[maxIndex+1] < 0 or arr[maxIndex-1] < 0):
            result = False
            break
    if result and (sum(arr) == 0):
        print("YES")
    else:
        print("NO")
            