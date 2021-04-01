# https://codeforces.com/problemset/problem/339/A
# Time O(n) | Aux Space O(1)

arr = [int(num) for num in input().split('+')]
arr.sort()

for num in arr[:-1]:
    print(num, '+', sep='', end='')
print(arr[-1])