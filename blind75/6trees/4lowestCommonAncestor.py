# https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

# Approach:
# Key word is binary search tree, that means left sub tree is smaller than root and right sub tree is greater than root.
# Now, we can think about what is the property of lowest common ansestor, it splits the two nodes at each side.
# If, even lower common ansestor exist, both the nodes will be in same direction (left or right sub tree)
# So, keep moving till a split in direction appears
# For the edge case where the root itself becomes one of the nodes, return root (cos going further won't have the node)

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        while root:
            if root.val == p.val or root.val == q.val:
                return root
            if root.val > p.val and root.val > q.val:
                root = root.left
            elif root.val < p.val and root.val < q.val:
                root = root.right
            else:
                return root