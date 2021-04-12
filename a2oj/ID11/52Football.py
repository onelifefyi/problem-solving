# https://codeforces.com/problemset/problem/96/A

# Time O(n) | Aux space O(1)

players = input()
print("YES" if ('1111111' in players or '0000000' in players) else "NO")