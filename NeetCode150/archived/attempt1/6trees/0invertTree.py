# https://leetcode.com/problems/invert-binary-tree/

# Approach:
# Recursive - at each step, we have to swap the left and right,
# And recursively do it for left sub tree and right sub tree
# Time O(logn) | Space O(n) (memory stack)

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root: return root
        root.left, root.right = root.right, root.left
        if root.left: root.left = self.invertTree(root.left)
        if root.right: root.right = self.invertTree(root.right)
        return root
