# https://codeforces.com/problemset/problem/122/A

import sys

n = input()

is_lucky = True

for ch in set(n):
    if ch not in "47":
        is_lucky = False
        break

if is_lucky or int(n) % 4 == 0 or int(n) % 7 == 0:
    print("YES")
else:
    print("NO")