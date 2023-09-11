https://leetcode.com/problems/set-matrix-zeroes/submissions/

class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """

        row_list = set()
        col_list = set()

        n_rows = len(matrix)
        n_cols = len(matrix[0])

        for i in range(n_rows):
            for j in range(n_cols):
                if matrix[i][j] == 0:
                    row_list.add(i)
                    col_list.add(j)
        
        for index in row_list:
            matrix[index] = [0] * n_cols

        for index in col_list:
            for _ in range(n_rows):
                matrix[_][index] = 0
                
        return matrix
