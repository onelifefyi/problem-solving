# https://leetcode.com/problems/balanced-binary-tree/

# Approach:
# Similar to previous problem, if at any point the height of left and right is greater than one
# Short circuit, and return False, but the question is how to shortcircuit??
# Turns out, there's no such thing as short circuit/break - can throw exception
# but not that it is going to improve the time complexity any way
# Otherwise, return True

# Fix: I can have a boolean variable outside that I can set to False
# Time O(n) | Space O(h), h -> max height

isBal = True
def isBalanced(root):
    dfs(root)
    return isBal

def dfs(root):
    if not root:
        return 0
    left = dfs(root.left)
    right = dfs(root.right)
    if abs(left - right) > 1: isBal = False
    return 1 + max(left, right)
