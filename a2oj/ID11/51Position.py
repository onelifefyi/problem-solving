# https://codeforces.com/problemset/problem/124/A

# Time complexity O(1) | Aux space O(1)
n, front, back = [int(num) for num in input().split()]

print(min((n-front),(back+1)))