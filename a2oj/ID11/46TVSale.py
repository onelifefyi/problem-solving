# https://codeforces.com/problemset/problem/34/B
# Time O(nlogn) | Aux space O(1)

n, m = [int(num) for num in input().split()]

TV = [int(num) for num in input().split()]
TV.sort()

i = 0
sum = 0
while(m>0 and i<n):
    if(TV[i] < 0):
        sum += -1*TV[i]
        m -= 1
    i += 1

print(sum)