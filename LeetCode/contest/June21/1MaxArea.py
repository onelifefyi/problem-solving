# https://leetcode.com/explore/featured/card/june-leetcoding-challenge-2021/603/week-1-june-1st-june-7th/3764/

def maxAreaOfIsland(grid):
    global filled
    filled = []
    for i in range(len(grid)):
        filled.append([0]*len(grid[0]))
    maxArea = 0
    for i in range(len(grid)):
        for j in range(len(grid[0])):
            if grid[i][j]==1 and filled[i][j]==0:
                area = 0
                area = dfs(grid, i, j, 0)
                maxArea = max(area, maxArea)
    print(maxArea)

def dfs(grid, x, y, area):
    if x<0 or y <0 or x>=len(grid) or y >= len(grid[0]):
        return area
    if filled[x][y]==1 or grid[x][y]==0:
        return area
    area += 1
    filled[x][y] = 1

    area = dfs(grid, x-1, y, area)
    area = dfs(grid, x+1, y, area)
    area = dfs(grid, x, y-1, area)
    area = dfs(grid, x, y+1, area)
    return area


#maxAreaOfIsland([[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]])
maxAreaOfIsland([[0,0,0,0,0,0,0,0]])
