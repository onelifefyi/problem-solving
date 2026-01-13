# https://codeforces.com/problemset/problem/160/A

input()

coins = sorted([int(num) for num in input().split()])
total = sum(coins)
curr = 0
count = 0
while curr <= total/2:
    curr += coins.pop()
    count += 1

print(count)
