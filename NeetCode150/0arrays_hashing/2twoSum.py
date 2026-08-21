# https://leetcode.com/problems/two-sum/

# Approach:
# The simplest way would be to find all pair and check for sum
# Time O(n^2) | Space O(1)

# Better:
# Create a  hasmap/dictionary, and for each num, store the target - num as key, and index as value
# Now, if the num exists in the hashmap, return the current index and value
# Time O(n) | space O(n)


def twoSum(nums, target):
    needed = dict()
    for index, value in enumerate(nums):
        if value in needed:
            return [needed[value], index]
        needed[target-value] = index
    return -1

# nums = [2,7,11,15]
nums = [3,2,4]
target = 6
# target = 9
print(twoSum(nums, target))
