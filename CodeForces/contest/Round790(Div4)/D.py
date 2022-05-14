#https://codeforces.com/contest/1676/problem/D

# Maximise Diagonal sum

def getDiagonalSumTop(mat, x, y):
    total = 0
    tempX = x 
    tempY = y 
    while tempX >= 0 and tempY >= 0:
        total += mat[tempX][tempY]
        tempX -= 1
        tempY -= 1
        # print("tempX, tempY", tempX, tempY)
    tempX = x 
    tempY = y 
    while tempX < len(mat) and tempY < len(mat[0]):
            total += mat[tempX][tempY]
            tempX += 1
            tempY += 1
    total -= mat[x][y]
    # print("exit for ",x ,y)
    return total

def getDiagonalSumBottom(mat, x, y):
    total = 0
    tempX = x 
    tempY = y 
    while tempX >= 0 and tempY < len(mat[0]):
        total += mat[tempX][tempY]
        tempX -= 1
        tempY += 1
        # print("tempX, tempY", tempX, tempY)
    tempX = x 
    tempY = y 
    while tempX < len(mat) and tempY >= 0:
            total += mat[tempX][tempY]
            tempX += 1
            tempY -= 1
    total -= mat[x][y]
    # print("exit for ",x ,y)
    return total    

css = int(input())
for _ in range(css):
    r, c = [int(x) for x in input().split(' ')]
    mat = []
    for row in range(r):
        values = [int(num) for num in input().split(' ')]
        mat.append(values)
    total = 0
    for x in range(r):
        for y in range(c):
            # print(f"Here for {x}, {y}")
            # print(mat)
            res = getDiagonalSumTop(mat, x, y) + getDiagonalSumBottom(mat, x, y) - mat[x][y]
            total = res if total < res else total
    print(total)