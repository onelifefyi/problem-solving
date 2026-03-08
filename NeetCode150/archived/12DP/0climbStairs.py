# https://leetcode.com/problems/climbing-stairs/description/

# Approach:
# To reach the nth step, their are two ways:
# First, take one step from n-1
# Second, take two steps from n-2
# So, we can combine all the possible ways to reach n-1 and n-2 to get the result
# Time O(n) | Space O(n)

def climbStairs(n):
    # for cases where n is small
    if n < 3: return n  
    ways = [0] * n
    ways[0] = 1
    ways[1] = 2
    for stair in range(2, n):
        ways[stair] = ways[stair-1] + ways[stair-2]
    return ways[-1]

n = 7
print(climbStairs(n))