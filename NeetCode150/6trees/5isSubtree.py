# https://leetcode.com/problems/subtree-of-another-tree/

# Approach:
# I don't know if there exist a better solution,
# But, I can use the previous problem, isSame tree, and run it for every element of root

# I'm struggling with the recursion
# f it, I'll use another function DFS or just BFS, to go through every node, perform isSameTree
# Update a flag, and return the value

# Time O(n * m) | Space O(h), h -> max width of the tree

from collections import deque
def isSubTree(root, subRoot):
    queue = deque([root])
    while queue:
        curr = queue.popleft()
        if isSameTree(curr, subRoot): return True
        if curr.left: queue.append(curr.left)
        if curr.right: queue.append(curr.right)
    return False

def isSameTree(p, q):
    if not p and not q: return True
    if not p or not q or (p.val != q.val): return False
    return isSameTree(p.left, q.left) and isSameTree(p.right, q.right)
