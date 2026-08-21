# https://leetcode.com/problems/daily-temperatures/

# Approach:
# Brute - Check all possible combinations to get the first 
# Time O(n^2) | Space O(1)

# Better
# Keep a stack of unresolved temperatures's index
# Each time it gets resolved, pop it out (without incrementing the pointer)
# Time O(n) | Space O(n)
def dailyTemperatures(temperatures):
    # This is based on index of decreasing (actually non-increasing) temperature
    unresolved_list = []
    result = [0] * len(temperatures)
    ptr = 0
    while ptr < len(temperatures):
        if not unresolved_list or temperatures[unresolved_list[-1]] >= temperatures[ptr]: 
            unresolved_list.append(ptr)
            ptr += 1
        else:
            result[unresolved_list[-1]] = ptr - unresolved_list[-1]
            unresolved_list.pop()
            # Don't want to increment the pointer till all resolvable temp has been resolved
    return result
        


temperatures = [73,74,75,71,69,72,76,73]
# temperatures = [30,40,50,60]
# temperatures = [30,60,90]
print(dailyTemperatures(temperatures))