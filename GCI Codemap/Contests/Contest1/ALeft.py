n, d =[int(num) for num in input().split()]
lst = [int(num) for num in input().split()]

d = d % n
pos = n-d
result = [0]*n
start = 0           
for _ in range(pos, n):
    result[_] = lst[start]
    start += 1

for _ in range(0, pos):
    result[_] = lst[start]
    start += 1

for x in result:
    print(x,end=' ')