# https://leetcode.com/problems/subtree-of-another-tree/

# Approach:
# Same as 2isSameTree
# Try to traverse the main tree and check for each node 2isSameTree
# Time O(n * isSameTree)


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

    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        stack = [root]
        while stack:
            curr = stack.pop()
            if self.isSameTree(curr, subRoot): return True
            if curr.left: stack.append(curr.left)
            if curr.right: stack.append(curr.right)
        return False
