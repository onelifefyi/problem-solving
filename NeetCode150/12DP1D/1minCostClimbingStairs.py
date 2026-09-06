# https://leetcode.com/problems/min-cost-climbing-stairs/description/

# Approach:
# The cost from nth step is cost + min(n-1 step, n-2 step)
# Just keep doing this to get to nth or n-1st step, return the minimum
# Time O(n) | Space O(1)

def minCostClimbingStairs(cost):
    if len(cost) < 2:
        return 0
    prev, prev2 = cost[1], cost[0]
    for i in range(2, len(cost)):
        curr = cost[i] + min(prev, prev2)
        prev2 = prev
        prev = curr
    return min(prev, prev2)


# cost = [1,100,1,1,1,100,1,1,100,1]
cost = [10]
print(minCostClimbingStairs(cost))
