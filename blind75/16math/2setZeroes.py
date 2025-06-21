# https://leetcode.com/problems/set-matrix-zeroes/description/
# Approach:
# Two pass, first pass, traverse to find all the row, col that has zero
# (can store it in a set())
# Second pass, set the corrosponding values to 0

# Time O(n*m) | Space O(n+m)
# To make space O(1), instead of using sets, use the first row and first col
# to store whether that row/col needs to be zeroed out

def setZeroes(matrix):
    zero_rows = set()
    zero_cols = set()
    for r in range(len(matrix)):
        for c in range(len(matrix[0])):
            if matrix[r][c] == 0:
                zero_rows.add(r)
                zero_cols.add(c)
    for r in range(len(matrix)):
        for c in range(len(matrix[0])):
            if r in zero_rows or c in zero_cols:
                matrix[r][c] = 0

    return matrix


matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
print(setZeroes(matrix))
