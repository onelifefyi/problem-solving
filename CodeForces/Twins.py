# https://codeforces.com/problemset/problem/160/A

n = int(input())
coins = []
sumTotal = 0
for num in input().split():
    sumTotal += int(num)
    coins.append(int(num))

picked = 0
count = 0
# print( sorted(coins, reverse=True))
for num in sorted(coins, reverse=True):
    picked += num
    count += 1
    if picked > sumTotal/2:
        print(count)
        break