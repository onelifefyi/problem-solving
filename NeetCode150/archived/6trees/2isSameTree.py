# https://leetcode.com/problems/same-tree/description/

# Approach:
# Check if both roots doesn't exist, then it's True
# If one of them doesn't exist, then it's False
# If the value doesn't match it's False
# Finally recursive call to check for left sub tree AND right sub tree
# Time O(n) | Space O(1)

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if not p and not q: return True
        if not p or not q: return False
        if p.val != q.val: return False
        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)