# https://leetcode.com/problems/invert-binary-tree/

# Approach:
# Simplest way would be to create a new tree, replacing everything

# Better:
# Recursive method, travers through the list, each time inverting left and right subtree
# Time O(n) (hitting every element once) | Space O(h) for tree recursion stack


def invertTree(root):
    if not root: return root
    left = root.left
    root.left = self.invertTree(root.right)
    root.right = self.invertTree(left)
    return root
