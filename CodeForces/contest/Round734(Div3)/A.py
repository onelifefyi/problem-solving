# https://codeforces.com/contest/1551/problem/A
# Time O(1) each case | Aux space O(1)
css = int(input())

for zz in range(css):
    total = int(input())
    c1 = c2 = total // 3
    if total%3 == 1:
        c1 += 1
    elif total%3 == 2:
        c2 += 1
    print(c1, c2)