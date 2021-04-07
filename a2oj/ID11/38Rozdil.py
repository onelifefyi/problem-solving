# https://codeforces.com/problemset/problem/205/A
# Time O(n) | Aux space O(1)

import sys

n = int(input())
cities = [int(num) for num in input().split()]

still = False
min = sys.maxsize
city = n
for index, distance in enumerate(cities):
    if distance <= min:
        if min == distance:
            still = True
        else:
            min = distance
            still = False
            city = index + 1

print(city if not still else "Still Rozdil")