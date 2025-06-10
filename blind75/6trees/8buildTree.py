# https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

# Approach:
# Nice problem!!!
# Using the pre-order, we know that the first element is the root
# Using that element, we can find the left subtree and right sub tree from the inorder traversal list
# Now, the good question is - how do you find the corrosponding inorder and preorder to pass
# inorder is easy, use the root to get that array
# preorder, well, you simply take the size of inorder and pass it, lol

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        if not preorder: return None
        division_index = 0
        for num in inorder:
            if num == preorder[0]: break
            division_index += 1
        node = TreeNode()
        node.val = preorder[0]
        node.left = self.buildTree(preorder[1:division_index+1], inorder[:division_index])
        node.right = self.buildTree(preorder[division_index+1:], inorder[division_index+1:])
        return node
        
