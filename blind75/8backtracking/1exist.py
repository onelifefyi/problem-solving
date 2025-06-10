# https://leetcode.com/problems/word-search/description/


# Approach:
# I'm thinking of a simple approach
# Have a pointer to point at current character
# Iterate through the matrix
# If matches, recursively call it for the next character of word in all 4 directions

def exist(board, word):
    visited = set()
    rows = len(board)
    cols = len(board[0])
    
    def dfs(row, col, i):
        if i == len(word): return True

        if row >= rows or col >= cols or row < 0 or col < 0: return False
        if word[i] != board[row][col]: return False
        if (row, col) in visited: return False

        visited.add((row,col))
        res = dfs(row-1, col, i+1) or dfs(row+1, col, i+1) or dfs(row, col-1, i+1) or dfs(row, col+1, i+1)
        visited.remove((row,col))
        return res
    for i in range(rows):
        for j in range(cols):
            if dfs(i, j, 0): return True
    return False


board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
word = "ABCTCED"
print(exist(board, word))