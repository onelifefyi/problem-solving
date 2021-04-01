# https://codeforces.com/problemset/problem/228/A
# Time O(1) | space O(1)

unique = set()
for color in input().split():
    unique.add(color)

print(4-len(unique))