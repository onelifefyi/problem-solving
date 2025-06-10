# https://leetcode.com/problems/validate-binary-search-tree/

# Approach:
# At the base case, if left is less than parent, and right is greater than parent, it's valid
# Recursively perform this step
# This didn't work because it's focusing only locally
# For BST, every element in left must be smaller than right (converse == True)

# Approach:
# We keep track of minimum and maximum
# When traversing the right side, we must focus that it should be greater than max (node val)
# When traversing the left, it must be less than min (node val)

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
# class Solution:
#     def isValidBST(self, root: Optional[TreeNode]) -> bool:
#         if not root:
#             return True
#         if root.left:
#             if not root.left.val < root.val: return False
#         if root.right:
#             if not root.right.val > root.val: return False
#         return True and isValidBST(root.left) and isValidBST(root.right)

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        def helper(node, low, high):
            if not node: return True
            if node.val <= low or node.val >= high: return False
            return helper(node.left, low, node.val) and helper(node.right, node.val, high)
        return helper(root, float("-inf"), float("inf"))