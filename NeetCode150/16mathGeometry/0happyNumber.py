# https://leetcode.com/problems/happy-number/

# Approach:
# I guess, can just compute, keep storing visited in a set, if repeats return False
# If it gets to 1, return True
# Time O(x) till the compute runs | Space O(x) 
# Interesting thing I got to know -> The number always shrink. So there will be no condition
# where it keeps going on till infinity

class Solution:
    def isHappy(self, n: int) -> bool:
        visited = set()
        while True:
            if n == 1: return True
            if n in visited: return False
            visited.add(n)
            temp = n
            n = 0
            while temp:
                n += (temp % 10) ** 2
                temp = temp // 10
