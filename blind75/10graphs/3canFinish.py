# https://leetcode.com/problems/course-schedule/

# Approach:
# Form a graph using the prerequisites list
# the first element of the sublist is the neighbor to the corresponding second element
# Finally check all the nodes, if anyone leads to cycle return false
# Otherwise, return true

def canFinish(numCourses, prerequisites):
    graph = {x:set() for x in range(numCourses)}
    for neighbor, course in prerequisites:
        graph[course].add(neighbor)

    visited = set()
    def hasCycle(course):
        if course in visited: return True
        if graph[course] == set(): return False
        visited.add(course)
        for pre in graph[course]:
            if hasCycle(pre): return True
        visited.remove(course)
        # optimization - if a course doesn't have cycle, it means we can complete it
        # so, we can set all the prerequisites as none for that course
        graph[course] = set()
        return False

    for course in range(numCourses):
        if hasCycle(course): return False

    return True


# numCourses = 2
# prerequisites = [[1,0]]
# numCourses = 2
# prerequisites = [[1,0],[0,1]]
numCourses = 7
prerequisites = [[1,0],[0,3],[0,2],[3,2],[2,5],[4,5],[5,6],[2,4]]
print(canFinish(numCourses, prerequisites))