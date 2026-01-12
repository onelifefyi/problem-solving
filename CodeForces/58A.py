# https://codeforces.com/problemset/problem/58/A

import sys

word = input()
index = 0
for ch in word:
    if ch == "hello"[index]:
        index += 1
    if index > 4: 
        print("YES")
        sys.exit()

print("NO")
