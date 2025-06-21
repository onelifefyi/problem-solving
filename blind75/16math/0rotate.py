# https://leetcode.com/problems/rotate-image/description/

# Approach:
# Set boundries, perform swap
# Do this over a loop for each item
# Time O(n^2) | Space O(1)

def rotate(matrix):
    l, r = 0, len(matrix[0]) - 1
    u, d = l, r
    
    while l < r:
        for i in range(r-l):
            temp = matrix[d-i][l]
            matrix[d-i][l] = matrix[d][r-i]
            matrix[d][r-i] = matrix[u+i][r]
            matrix[u+i][r] = matrix[u][l+i]
            matrix[u][l+i] = temp
        l += 1
        r -= 1
        u += 1
        d -= 1
    return matrix

matrix = [[1,2,3],[4,5,6],[7,8,9]]
matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
print(matrix)
print(rotate(matrix))
