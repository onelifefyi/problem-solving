# https://codeforces.com/contest/1538/problem/A

css = int(input())
for zz in range(css):
    n = int(input())
    arr = [int(num) for num in input().split(' ')]
    maxVal = max(arr)
    minVal = min(arr)
    minMove = n
    leftSide = max(arr.index(minVal), arr.index(maxVal)) + 1
    rightSide = max(arr[::-1].index(minVal), arr[::-1].index(maxVal)) + 1
    leftRight = min((arr.index(minVal) + arr[::-1].index(maxVal)), (arr[::-1].index(minVal) + arr.index(maxVal))) + 2
    print(min(min(leftSide, rightSide), leftRight))