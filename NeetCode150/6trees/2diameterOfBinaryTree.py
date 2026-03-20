# https://leetcode.com/problems/diameter-of-binary-tree/

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# Approach:
# Recursion | leap of faith
# At any point, the max diameter would be the sum of max depth from left subtree
# added with max depth from right subtree
# Time O(n*n)? | Space O(h)??
# This does work, but slow
# class Solution:
    # def maxDepth(self, root: Optional[TreeNode]) -> int:
    #     if not root: return 0
    #     return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))

    # def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
    #     if not root: return 0
    #     total = self.maxDepth(root.left) + self.maxDepth(root.right)
    #     return max(total, self.diameterOfBinaryTree(root.left), self.diameterOfBinaryTree(root.right))
        

# Approach (Optimized O(N) Time):
# Previously, calling maxDepth repeatedly at every node resulted in O(N^2) time due to duplicated traversals.
# To fix this, we can create a global variable, and keep updating it as we find max depth of left subtree and right subtree
# Achieved by adding them together
# Time O(n) | Space O(h) where h is the height of the tree
class Solution:
    def height(self, root):
        if not root: return 0
        left = self.height(root.left)
        right = self.height(root.right)
        self.max_depth = max(self.max_depth, left + right)
        return 1 + max(left, right)

    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.max_depth = 0
        if not root: return 0
        self.height(root)
        return self.max_depth
