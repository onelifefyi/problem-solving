# https://codeforces.com/problemset/problem/133/A
# Time O(n) | Space O(1)

willPrint = False
for ch in input():
    if ch in ['H', 'Q', '9']:
        willPrint = True
        break

print("YES" if willPrint else "NO")