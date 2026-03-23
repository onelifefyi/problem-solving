# https://leetcode.com/problems/min-cost-climbing-stairs/

# Approach:
# I believe this is conceptually similar to 0climbingStairs.py, for each step, I can keep storing the minimum
# Cost of reaching that spot. I can get to position n, by either cost so far for n-1 or n-2
# Each step, keep updating the total cost so far for reaching n
# Time O(n) | Space O(1)


def minCostClimbingStairs(cost: list[int]) -> int:
    for i in range(2, len(cost)):
        cost[i] += min(cost[i-1], cost[i-2])
    return min(cost[-1], cost[-2])

cost = [10,15,20]
# cost = [1,100,1,1,1,100,1,1,100,1]
print(minCostClimbingStairs(cost))