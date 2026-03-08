# https://leetcode.com/problems/search-a-2d-matrix/description/


# Approach:
# Linear search: Time O(r*c) | Space O(1)

# Approach:
# Perform binary search on rows, to get to the correct row
# Then, within that row, perform binary search to get to the column

# I'm thinking two pass
# Pass one, get to the row
# Second pass, get the col or return False
# Time O(logn + logm) | Space O(1) 
def searchMatrix(matrix, target):
    # row selection
    top_row = 0
    bottom_row = len(matrix) - 1

    row = -1
    while top_row <= bottom_row:
        mid = (top_row + bottom_row)//2
        # print(mid)
        if target >= matrix[mid][0] and target <= matrix[mid][-1]:
            row = mid
            break
        elif target > matrix[mid][-1]: top_row = mid + 1
        else: bottom_row = mid - 1
    
    # col selection
    if row == -1: return False
    left, right = 0, len(matrix[0]) - 1
    while left <= right:
        mid = (left + right)//2
        if matrix[row][mid] == target: return True
        elif target > matrix[row][mid]: left = mid + 1
        else: right = mid - 1
    return False
    

# matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
# target = 16
matrix = [[1]]
target = 2
print(searchMatrix(matrix, target))