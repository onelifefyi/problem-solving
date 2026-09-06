# https://leetcode.com/problems/same-tree/

# Approach:
# The standard traversal won't work
# One simple approach I can think of is that, keep comparing each node
# If going to p.left, go to q.left, and see if it matches
# If null, or no match return False

# Time O(n) | Spcae O(h), h -> max depth

def isSameTree(p, q):
    if not p and not q: return True
    if not p or not q or (p.val != q.val): return False
    return isSameTree(p.left, q.left) and isSameTree(p.right, q.right)
