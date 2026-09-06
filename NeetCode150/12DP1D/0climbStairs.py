# https://leetcode.com/problems/climbing-stairs/

# Approach:
# Recursive, we know that to get to the nth step, there are two ways
# First, from n-1 one step, and second, from n-2 two steps
# Time O(n)... umm, no, more than that, I don't understand, took too much time for input 100 | Space O(n)
# This is taking too much time for n = 100
# Hint: Actually time is O(2^n), because to get steps(5), I'm calculating steps(4) once, and steps (3) twice recurcively..
# So, I end up doing repeated work

# def climbStairs(n):
#    if n == 1:
#        return 1
#    if n == 2:
#        return 2
#    return climbStairs(n - 1) + climbStairs(n - 2)

# If we can have some memory, and build from previous ones, it'll be easier
# create a list of size n, then keep filling each ones
# Time O(n) | Space O(n)

# def climbStairs(n):
#    if n < 2: return n
#    mem = [0] * n
#    mem[0], mem[1] = 1, 2
#    for i in range(2, n):
#        mem[i] = mem[i-1] + mem[i-2]
#    return mem[-1]

# Even better, I just need two numbers:
# Time O(n) | Space O(1)
def climbStairs(n):
    if n <= 2: return n
    oneStepBack = 1
    twoStepBack = 2
    steps = 0
    for _ in range(n-2):
        steps = oneStepBack + twoStepBack 
        oneStepBack, twoStepBack = twoStepBack, steps
    return steps


n = 2
print(climbStairs(n))
