# https://codeforces.com/problemset/problem/248/A
# Time O(n) | space O(1)

n = int(input())

leftOpen = 0
rightOpen = 0
for _ in range(n):
    door = input().split()
    if door[0] == '0':
        leftOpen += 1
    if door[1] == '0':
        rightOpen += 1

print(min(leftOpen, n-leftOpen) + min(rightOpen, n-rightOpen))