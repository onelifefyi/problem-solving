t = int(input())

for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))

    a.sort()

    i = 0
    while i < n - 1:
        if abs(a[i] - a[i+1]) > 1:
            print("NO")
            break
        i += 1
    else:
        print("YES")
