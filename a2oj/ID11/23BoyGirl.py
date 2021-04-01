# https://codeforces.com/problemset/problem/236/A
# Time O(n) | Aux space O(1)

distinct = set()
for char in input():
    distinct.add(char)

print("CHAT WITH HER!" if len(distinct)%2==0 else "IGNORE HIM!")