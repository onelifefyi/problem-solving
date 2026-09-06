# https://leetcode.com/problems/maximum-depth-of-binary-tree/ 

# Approach:
# I can perform dfs, keeping track of maxDepth
# Time O(n) | Space O(h) (max recursion depth)

def maxDepth(root):
    return dfs(root, 0)

def dfs(root, height):
    if not root:
        return height
    height += 1
    return max(dfs(root.left, height), dfs(root.right, height))

