# https://codeforces.com/problemset/problem/61/A

a = input()
b = input()

i = 0
while i < len(a):
    if a[i] != b[i]:
        print("1", end="")
    else:
        print("0", end="")
    i += 1
