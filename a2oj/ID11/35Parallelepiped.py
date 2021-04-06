# https://codeforces.com/problemset/problem/224/A
# Time O(1) | Aux Space O(1)

# Note: Had to derive expression (line 9) using pen/paper

import math
x, y, z = [int(num) for num in input().split()]

print(int(4*(x*y + y*z + z*x)/math.sqrt(x*y*z)))