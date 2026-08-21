# https://leetcode.com/problems/valid-sudoku/

# Approach
# The brute approach - for each element, check the rows, check the cols, and the sub-grid.
# Time O(1) | Space O(1) becuase it's always 3x3, super optimal, lol

# Better:
# Can maintain hashset for each possibility: 9 + 9 for each row and col, +9 for each grid
# Keep inserting per relevance, if duplicate, return False
# Otherwise return True
# Time O(1) | Space O(1)
from collections import defaultdict
def isValidSudoku(board):
    rows = [set() for _ in range(9)]
    cols = [set() for _ in range(9)]
    grid = defaultdict(set)

    for row in range(9):
      for col in range(9):
        num = board[row][col]
        if num == ".": continue
        if num in rows[row] or num in cols[col] or num in grid[(row//3, col//3)]: return False
        rows[row].add(num)
        cols[col].add(num)
        grid[(row//3, col//3)].add(num)
    return True


# Test board
board = [
  ["5","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]

print(isValidSudoku(board))
