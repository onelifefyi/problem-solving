# https://codeforces.com/problemset/problem/1614/A
css = int(input())
for _ in range(css):
    n, l, r, k = [int(num) for num in input().split()]
    prices = [int(num) for num in input().split()]
    prices.sort()
    total = 0
    for cost in prices:
        if k<cost or r<cost:
            break
        elif l>cost:
            continue
        else:
            total += 1
            k -= cost
    print(total)
        