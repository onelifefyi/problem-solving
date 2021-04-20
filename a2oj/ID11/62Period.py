# https://codeforces.com/problemset/problem/352/B

# Incomplete

n = int(input())
arr = {}

for index, num in enumerate(input().split()):
    posList = arr.get(num, [])
    # print("posList",posList, "input", num)
    arr[num] = posList + [index]

print(len(arr.keys()))

for ky in arr.keys():
    if len(arr[ky]) == 1:
        print(ky, 0)
    else:
        print(ky, )