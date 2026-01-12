# https://codeforces.com/problemset/problem/467/A

count = 0
for _ in range(int(input())):
    p, q = [int(i) for i in input().split()]
    count += 1 if (q - p) >= 2 else 0

print(count)
