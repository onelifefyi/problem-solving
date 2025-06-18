# https://leetcode.com/problems/graph-valid-tree/description/

# Approach:
# First, we need to think about the properties of a tree
# Rule #1: No cycles
# Unidirectional (Fit's above, i.e, cycle with two nodes
# Build the tree dict of n nodes, and corresponding neighbors
# Traverse through the graph checking if cycle exists

def validTree(n, edges):
    graph = {}
    for x in range(n): graph[x] = set()
    for edge in edges:
        graph[edge[0]].add(edge[1])
        graph[edge[1]].add(edge[0])

    visited = set()
    traversed = []
    # This is what I was missing, parent
    # We've to ignore the parent while performing recursive search
    def hasCycle(node, parent):
        if node in visited: return True
        visited.add(node)
        traversed.append(node)
        for neighbor in graph[node]:
            if neighbor == parent: continue
            if hasCycle(neighbor, node): return True
        visited.remove(node)
        return False

    return not hasCycle(0, None) and len(traversed) == n
# n=5
# edges=[[0,1],[1,3],[3,0],[2,4]]
n=5
edges=[[0,1],[0,2],[0,3],[1,4]]
print(validTree(n, edges))