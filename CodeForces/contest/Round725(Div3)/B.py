# https://codeforces.com/contest/1538/problem/B

css = int(input())
for zz in range(css):
    n = int(input())
    candies = [int(num) for num in input().split(' ')]
    total = sum(candies)
    if total%n != 0:
        print(-1)
    else:
        candies.sort()
        avg = total//n
        count = 0
        for candy in candies[::-1]:
            if candy > avg:
                count += 1
            else:
                break
        print(count)