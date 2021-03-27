# https://codeforces.com/problemset/problem/271/A

def unique(num):
    count = set()
    for char in num:
        count.add(char)

    if len(count) < 4:
        return False
    else:
        print(num)
        return True

num = int(input())

while True:
    num += 1
    if unique(str(num)):
        break

