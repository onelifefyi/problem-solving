# https://leetcode.com/problems/two-sum/

# Approach:
# Check all possible pairs
# Time O(n^2) | Space O(1)

# Appraoch:
# The idea is num1 + num2 must be equal to target
# So, for each num1 keep track of required num2 to make target
# This can be achieved using dictionary
# Since we are returning the index, it's a good idea to store the index as well
# Time O(n) | Space O(n)
def twoSum(nums, target):
    required_dict = {}
    for index, val in enumerate(nums):
        if val in required_dict:
            return [index, required_dict[val]]
        required_dict[target - val] = index
    return -1

# nums = [2,7,11,15]
# target = 9
nums = [3,2,4]
target = 6
print(twoSum(nums, target))