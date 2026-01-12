# https://codeforces.com/problemset/problem/271/A

num = int(input()) + 1

while True:
    if len(str(num)) == len(set(str(num))):
        print(num)
        break
    num += 1
