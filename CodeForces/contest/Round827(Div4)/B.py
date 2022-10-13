css = int(input())

for _ in range(css):
    size = int(input())
    arr = [int(num) for num in input().split()]
    arr.sort()
    result = "YES"
    ptr = 1
    while ptr<size:
        if arr[ptr] == arr[ptr-1]:
            result = "NO"
            break
        ptr += 1
    print(result)