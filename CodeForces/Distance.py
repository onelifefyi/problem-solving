css = int(input())
for _ in range(css):
    x, y = [int(num) for num in input().split()]
    if (x + y)%2 != 0:
        print(-1, -1)
    elif x%2 == 0:
        print(int(x/2), int(y/2))
    else:
        if x > 0:
            print(int((x-1)/2), int((y+1)/2))
        else:
            print(int((x+1)/2), int((y-1)/2))