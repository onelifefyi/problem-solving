# https://leetcode.com/problems/climbing-stairs/

# Dynamic programming sounds difficult.. but the concept seem more like recursion

# Approach:
# Can start building from the beginning
# 1 step - 1 way (1)
# 2 step - 2 ways (1 + 1, 2)
# 3 step - # ways to get to 1st step (then take +2) + # ways to get to 2nd step (then take +1)
# So, for nth step, it should be #ways to get to (n-2)th step + #ways to get to (n-1)th step
# Time O(n) | Space O(1)

def climbStairs(self, n: int) -> int:
    if n <= 2: return n
    stepMinusTwo = 1
    stepMinusOne = 2
    steps = 0
    for i in range(n-2):
        steps = stepMinusTwo + stepMinusOne
        stepMinusTwo = stepMinusOne
        stepMinusOne = steps
    return steps
