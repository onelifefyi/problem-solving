# https://leetcode.com/problems/invert-binary-tree/

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


# Approach:
# Using recursion:
# Base - when the root in null, return the root
# Then, swap the inverTed version of left node and right node (using temp variable)
# Doubt - Time O(n)? | Space O(logn)?
# Correct - Time O(n) | Space O(h) where h is the height of the tree (best logn, worst n)
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root: return root
        temp = self.invertTree(root.left)
        root.left = self.invertTree(root.right)
        root.right = temp
        return root
        

