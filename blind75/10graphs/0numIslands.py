# https://leetcode.com/problems/number-of-islands/description/
# Approach:
# I'd perform a depth first search for each index
# and keep a count of for every valid call

def numIslands(grid):
    islands = 0
    visited = set()

    def dfs(row, col):
        if row < 0 or row >= len(grid) or col < 0 or col >= len(grid[0]) or grid[row][col] == "0" or (row, col) in visited:
            return
        visited.add((row, col))
        dfs(row+1, col)
        dfs(row, col+1)
        dfs(row-1, col)
        dfs(row, col-1)
        return True
        
    for row in range(len(grid)):
        for col in range(len(grid[0])):
            if (row, col) not in visited and grid[row][col] == "1":
                islands += 1
                dfs(row, col)

test_grid = [
    ["1", "1", "0", "0", "0"],
    ["0", "1", "0", "0", "1"],
    ["0", "0", "0", "1", "1"],
    ["0", "0", "0", "0", "0"]
]


print(numIslands(test_grid))