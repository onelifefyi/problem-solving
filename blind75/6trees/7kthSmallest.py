# https://leetcode.com/problems/kth-smallest-element-in-a-bst/

# Approach:
# Brute approach - perform inorder traversal to get sorted array
# return the ith element
# Time O(n)

# hmm, I believe the above approach is the optimal (need the size)
# one improvement we can make is to cut off when we get to ith element
# OMG!! The implementation taught me so many things
# I was simply returning when k == pos
# But, that return wasn't being carried forward to the recursive call stack
# Needed lots of work around
# still O(n)

# now the question is how to do in-order, lol
# Perform DFS, first left recursive call
# Then add node to result
# Then right recursive call


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        self.k = k
        self.res = None

        def dfs(node):
            if not node or self.res: return
            dfs(node.left)
            self.k -= 1
            if self.k == 0: 
                self.res = node.val
                return
            dfs(node.right)
        dfs(root)
        return return self.res