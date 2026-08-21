# https://leetcode.com/problems/balanced-binary-tree/

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# Approach
# Perform DFS to get height on left subtree, and on the right subtree, compare length
# Return False if different, else at the end return True
# Time O(n^2) | Space O(n)
# class Solution:
    # def height(self, node):
    #     if not node: return 0
    #     left = self.height(node.left)
    #     right = self.height(node.right)
    #     return 1 + max(left, right)
    # def isBalanced(self, root: Optional[TreeNode]) -> bool:
    #     if not root: return True
    #     if abs(self.height(root.left) - self.height(root.right)) > 1: return False
    #     if not (self.isBalanced(root.left) and self.isBalanced(root.right)): return False
    #     return True

# Approach:
# as i'm getting the height, along with that I can also return if it's balanced or not
# truth be told, still a bit confused with complexity
# Time O(n) | Space O(n)
class Solution:
    def height(self, node) -> list:
        if not node: return [True, 0]
        left = self.height(node.left)
        right = self.height(node.right)
        balanced = abs(left[1] - right[1]) <= 1 and left[0] and right[0]
        return [balanced, 1 + max(left[1], right[1])]
        

    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        return self.height(root)[0]
        

