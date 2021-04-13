# https://codeforces.com/problemset/problem/221/A

# Time O(n) | aux space O(1)

# f(x):
#     if 1 exit
#     else:
#         f(x-1)
#         swap(x, x-1)

# 1, 2, 3, 4, 5, 6, 7
# 2, 3, 4, 5, 6, 7, 1

n = int(input())
print(n, end=' ')

if n>1:
    num = 1
    for _ in range(n-1):
        print(num, end=' ')
        num += 1