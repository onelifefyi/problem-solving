# https://codeforces.com/problemset/problem/231/A

n = int(input())
total = 0
for _ in range(n):
    count = 0
    for ch in input().split():
        if ch == '1':
            count += 1
    if count >= 2:
        total += 1

print(total)