# https//codeforces.com/problemset/problem/165/A
# Time O(n2) | Aux space O(1)

n = int(input())

cordinatesList = []
for _ in range(n):
    cordinatesList.append([int(num) for num in input().split()])

superCentral = 0
for point in cordinatesList:
    boolLeft = False
    boolRight = False
    boolUp = False
    boolDown = False
    for neighbour in cordinatesList:
        if boolLeft and boolRight and boolUp and boolDown:
            break
        if neighbour[0] < point[0] and neighbour[1] == point[1]:
            boolLeft = True
        if neighbour[0] > point[0] and neighbour[1] == point[1]:        
            boolRight = True
        if neighbour[0] == point[0] and neighbour[1] > point[1]:
            boolUp = True
        if neighbour[0] == point[0] and neighbour[1] < point[1]:                        
            boolDown = True
    if boolLeft and boolRight and boolUp and boolDown:
        superCentral += 1

print(superCentral)
