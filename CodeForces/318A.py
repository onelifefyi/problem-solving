# https://codeforces.com/problemset/problem/318/A
import math

n, pos = [int(x) for x in input().split()]
is_odd = True if (pos <= math.ceil(n/2)) else False

result = 1 + (pos - 1) * 2 if is_odd else 2 + (pos - math.ceil(n/2) - 1) * 2
print(result)
