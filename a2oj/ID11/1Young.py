# https://codeforces.com/problemset/problem/69/A
# Time O(1) | space O(1)

n = int(input())
x = 0
y = 0
z = 0
for css in range(n):
    coordinates = [int(num) for num in input().split()]
    x += coordinates[0]
    y += coordinates[1]
    z += coordinates[2]

if x==0 and y==0 and z==0:
    print("YES")
else:
    print("NO")