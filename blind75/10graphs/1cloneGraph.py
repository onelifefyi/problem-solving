# https://leetcode.com/problems/clone-graph/

# Approach:
# Maintain a dict oldToNew, to keep track of the node already visited
# key -> node from old graph
# value -> corrosponding node created for new graph

"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        if not node: return None
        oldToNew = {}

        def dfs(node):
            if node in oldToNew:
                return oldToNew.get(node)
            new_node = Node(node.val)
            oldToNew[node] = new_node
            for neighbor in node.neighbors: new_node.neighbors.append(dfs(neighbor))
            return new_node

        return dfs(node)
