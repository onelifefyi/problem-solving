# https://leetcode.com/problems/pacific-atlantic-water-flow/
# Approach:
# What if we start from the border, and perform DFS to know all the places that pacific can reach
# Similarly find all the places that atlantic can reach
# Return the intersection

def pacificAtlantic(heights):
    pacific_visited = set()
    atlantic_visited = set()

    rows = len(heights)
    cols = len(heights[0])

    def dfs(row, col, prev_height, visited):
        if row < 0 or col < 0 or row >= rows or col >= cols: return
        if (row, col) in visited: return
        if heights[row][col] < prev_height: return
        visited.add((row, col))
        dfs(row - 1, col, heights[row][col], visited)
        dfs(row, col - 1, heights[row][col], visited)
        dfs(row, col + 1, heights[row][col], visited)
        dfs(row + 1, col, heights[row][col], visited)
        return

    for r in range(rows):
        for c in range(cols):
            if r == 0 or c == 0:
                dfs(r, c, 0, pacific_visited)
            if r == rows - 1 or c == cols - 1:
                dfs(r, c, 0, atlantic_visited)

    return [list(position) for position in pacific_visited & atlantic_visited]

test = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
print(pacificAtlantic(test))
