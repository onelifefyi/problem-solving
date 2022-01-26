# Note: Always take care of edge cases, I forgot to take care of situation where on the last wind sail reaches destination.
# So I was missing out on the last case
t, sx, sy, ex, ey = [int(num) for num in input().split()]

requirementX = ex - sx
requirementY = ey - sy

if requirementX==0 and requirementY==0:
    print(0)
else:
    time = 0
    result = -1
    for ch in input():
        if ch=="N" and requirementY>0:
            requirementY -= 1
        elif ch=="S" and requirementY<0:
            requirementY += 1
        elif ch=="E" and requirementX>0:
            requirementX -= 1
        elif ch=="W" and requirementX<0:
            requirementX += 1
        
        time += 1
        if requirementX==0 and requirementY==0:
            result = time
            break

    print(result)