n = int(input())

row = 0
while(row<n):
    col = 0
    while(col<=row):
        print(col, end=" ")
        col += 1
    print()
    row += 1

print("_____________________________________")

for row in range(n+1):
    for _ in range(n-row):
        print(" ", end=" ")
    for col in range(row):
        print(col, end=" ")
    print()

print("_____________________________________")