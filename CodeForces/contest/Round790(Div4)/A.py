# https://codeforces.com/contest/1676/problem/A
css = int(input())
for _ in range(css):
    arr = input()
    arr = [int(num) for num in arr]
    if arr[0] + arr[1] + arr[2] == arr[3] + arr[4] + arr[5]:
        print("YES")
    else:
        print("NO")