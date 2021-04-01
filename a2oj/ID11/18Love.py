# https://codeforces.com/problemset/problem/155/A
# Time O(n) | Aux Space O(1)

n = int(input())
scores = input().split()

max = int(scores[0])
min = max

amgCount = 0
for num in scores:
    if int(num) > max:
        max = int(num)
        amgCount += 1
    elif int(num) < min:
        min = int(num)
        amgCount += 1

print(amgCount)