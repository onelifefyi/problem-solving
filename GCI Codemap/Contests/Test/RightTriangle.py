# https://vjudge.net/problem/aizu-0003

n = int(input())
for _ in range(n):
    sides = [int(num) for num in input().split()]
    sides.sort()
    print('YES' if sides[0]**2 + sides[1]**2 == sides[2]**2 else 'NO')