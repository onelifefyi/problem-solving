# https://codeforces.com/problemset/problem/266/A
n = int(input())
stones = str(input())

prev = stones[0]
count = 0
for i in range(1, n):
    if stones[i] == prev:
        count += 1
    else:
        prev = stones[i]

print(count)