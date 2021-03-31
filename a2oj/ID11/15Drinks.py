# https://codeforces.com/problemset/problem/200/B
# Time O(n) | Aux Space O(1)

n = int(input())
sum = 0
for num in input().split():
    sum += int(num)

print(sum/n)