# https://leetcode.com/problems/binary-tree-level-order-traversal/description/

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# Approach:
# Use a queue. Start from root, use a while loop to add a list of all the values in the queue, append it to result
# While filling the queue for next level
# Return the funal resukt
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root: return []
        queue = [root]
        final_result = []
        while queue:
            result = []
            for _ in range(len(queue)):
                node = queue.pop(0)
                result.append(node.val)
                if node.left: queue.append(node.left)
                if node.right: queue.append(node.right)
            final_result.append(result)
        return final_result