# Getting error on test case 2 ! IDK!
css = int(input())
for _ in range(css):
    size = int(input())
    if size%2 == 1:
        print("NO")
    else:
        result = "1 -1 "*(size//2)
        print("YES")
        print(result[:-1])