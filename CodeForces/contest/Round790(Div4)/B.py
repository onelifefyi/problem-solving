# https://codeforces.com/contest/1676/problem/B
css = int(input())
for _ in range(css):
    n = int(input())
    arr = [int(num) for num in input().split(' ')]
    toKeep = min(arr)

    toEat = 0
    for candies in arr:
        toEat += candies - toKeep

    print(toEat)