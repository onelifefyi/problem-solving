# https://leetcode.com/problems/spiral-matrix/

# Appraoch:
# Kind of like game engine (directional key press)
# Have 4 boolean values for direction
# When True, move in that direction


# Update -> Edge cases are important, make sure to point the pointer
# to correct next cell before moving from that button press
# Keep the edges in mind as well

# Time O(n*m) | Space O(n*m)
def spiralOrder(matrix):
    r, c = 0, 0
    goL, goD, goU = False, False, False
    goR = True
    top = 0
    bottom = len(matrix) - 1
    left = 0
    right = len(matrix[0]) - 1

    matSize = len(matrix) * len(matrix[0])
    res = []
    while len(res) < matSize:
        if goR:
            while c <= right:
                res.append(matrix[r][c])
                c += 1
            c -= 1
            goR = False
            goD = True
            top += 1
            r += 1
        elif goD:
            while r <= bottom:
                res.append(matrix[r][c])
                r += 1
            r -= 1
            goD = False
            goL = True
            right -= 1
            c -= 1
        elif goL:
            while c >= left:
                res.append(matrix[r][c])
                c -= 1
            c += 1
            goL = False
            goU = True
            bottom -= 1
            r -= 1
        elif goU:
            while r >= top:
                res.append(matrix[r][c])
                r -= 1
            r += 1
            goU = False
            goR = True
            left += 1
            c += 1
    return res
        

                

matrix = [[1,2,3],[4,5,6],[7,8,9]]
print(spiralOrder(matrix))
