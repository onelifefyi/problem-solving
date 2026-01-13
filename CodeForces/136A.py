# https://codeforces.com/problemset/problem/136/A

size = int(input())

result = [0] * size
index = 0
for num in input().split():
    result[int(num)-1] = str(index + 1)
    index += 1

print(" ".join(result))
