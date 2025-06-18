# https://neetcode.io/problems/count-connected-components?list=blind75

# Approach:
# Similar to last problem, iterate through the array
# This time though call for all items of the graph
# If already in traversed, skip

# Ah!! I complicated for no reason
# Simply traverse and check components, no need of parent/neighbor cycle and so on

def countComponents(n, edges):
    graph = {i: set() for i in range(n)}
    for n1, n2 in edges:
        graph[n1].add(n2)
        graph[n2].add(n1)

    traversed = set()
    components = 0
    def dfs(node):
        if node in traversed: return
        traversed.add(node)
        for neighbor in graph[node]:
            dfs(neighbor)

    for node in graph:
        if node in traversed: continue
        components += 1
        dfs(node)
    return components

# n=3
# edges=[[0,1], [0,2]]
# n=3
# edges=[[0,1],[0,2]]
n=6
edges=[[0,1],[1,2],[2,3],[4,5]]
print(countComponents(n, edges))

