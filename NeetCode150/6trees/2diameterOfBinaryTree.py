# https://leetcode.com/problems/diameter-of-binary-tree/description/

# Approach:
# Will have to keep track of max on the outside
# We build from bottom up (if that makes sense)
# For each node, set the height as max depth(LST, RST), and updated the max as depth of LST + RST
# Keep climbing up
# Return the max
# Time O(n) | Space O(h), max recursion depth

maxDia = 0
def diameterOfBinaryTree(root):
    dfs(root)
    return maxDia

def dfs(curr):
    if not curr:
        return 0
    left = dfs(curr.left)
    right = dfs(curr.right)
    maxDia = max(maxDia, left + right)
    return 1 + max(left, right)
