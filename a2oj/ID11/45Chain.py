# https://codeforces.com/problemset/problem/215/A

# Time O(n^2) | Aux Space O(1)
na = int(input())
gearA = [int(num) for num in input().split()]

nb = int(input())
gearB = [int(num) for num in input().split()]


max = -1
maxCount = 0
for gA in gearA:
    for gB in gearB:
        if gB%gA==0:
            # print("duv", gB, gA, max)
            div = gB/gA
            if max < div:
                max = div
                maxCount = 1
            elif max == div:
                maxCount += 1
        

print(maxCount)