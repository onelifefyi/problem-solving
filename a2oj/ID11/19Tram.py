# https://codeforces.com/problemset/problem/116/A
# Time O(n) | Aux space O(1)

n = int(input())

max = 0
total = 0
for _ in range(n):
    station = input().split()
    total = total - int(station[0])
    total = total + int(station[1])
    if max < total:
        max = total
    
print(max)
