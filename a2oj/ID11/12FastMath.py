# https://codeforces.com/problemset/problem/61/A
# Time O(n) | space O(1)

l1 = input()
l2 = input()

for i in range(0, len(l1)):
    if l1[i] == l2[i]:
        print(0, end='')
    else:
        print(1, end='')