# https://codeforces.com/problemset/problem/282/A
# Time O(n) | Aux space O(1)

n = int(input())

x = 0
for _ in range(n):
    if '+' in input():
        x += 1
    else:
        x -= 1

print(x)