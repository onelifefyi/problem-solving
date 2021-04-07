# https://codeforces.com/problemset/problem/318/A
# Time O(1) | Aux space O(1)

import math

n, k = [int(num) for num in input().split()]
if (k <= math.ceil(n/2)):
    print(k*2 - 1)
else:
    k -= math.ceil(n/2)
    print(k*2)