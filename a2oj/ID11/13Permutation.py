# https://codeforces.com/problemset/problem/233/A
# Time O(n) | space O(1)
n = int(input())
if n%2==1:
    print('-1')
else:
    for i in range(n, 0, -1):
        print(i, end=' ')