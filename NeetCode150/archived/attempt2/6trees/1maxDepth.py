# https://leetcode.com/problems/maximum-depth-of-binary-tree/

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# Approach:
# Using BFS
# Can use a queue to iterate over each level, at each level increment the depth by 1
# Time O(n) | Space O(n)
# class Solution:
#     def maxDepth(self, root: Optional[TreeNode]) -> int:
#         if not root: return 0
#         q = [root]
#         depth = 0
#         while q:
#             depth += 1
#             for i in range(len(q)):
#                 curr = q.pop(0)   # This will make it time O(n), use deque.popleft() instead for O(1) pop
#                 if curr.left: q.append(curr.left)
#                 if curr.right: q.append(curr.right)
#         return depth

# Approach:
# Using DFS
# Need to create another method (dfs(root, height)), so that I can create a variable to keep track of max depth.
# Time O(n) | Space O(h) where h is the height
# class Solution:
#     max_depth = 0    
#     def maxDepth(self, root: Optional[TreeNode]) -> int:
#         def dfs(root, height):
#             if not root: return
#             height += 1
#             self.max_depth = max(self.max_depth, height)
#             dfs(root.left, height)
#             dfs(root.right, height)
#         dfs(root, 0)
#         return self.max_depth

# Ah, you kidding me, there's a more elegant DFS approach
# instead of dealing with global variables, and sub-functions
# simply rely on elegance of recursion
# I could simply return 1+max(maxDepth(left subtree), maxDepth(right subtree))
# Time O(n) | Space O(h) where h is height of the tree
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root: return 0
        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))