# https://codeforces.com/problemset/problem/34/A
# Time O(n) | aux space O(1)
import sys

n = int(input())
length = [int(num) for num in input().split()]

s1 = 1
s2 = n
min = 1001

if abs(length[0] - length[-1]) < min:
    min = abs(length[0] - length[-1])

i = 0
while(i < n-1):
    diff = abs(length[i]-length[i+1])
    if diff < min:
        min = diff
        s1 = i+1
        s2 = i+2
    i += 1

print(s1, s2)