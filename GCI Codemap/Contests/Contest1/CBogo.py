n = int(input())
for _ in range(n):
    size = int(input())
    result = [int(num) for num in input().split()]
    result.sort()
    for num in result[::-1]:
        print(num, end=' ')