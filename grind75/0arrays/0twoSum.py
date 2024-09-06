# https://leetcode.com/problems/two-sum/description/

# Basic: For each pair of numbers, check if sum equals to the target, if so return the respective index
# Time O(n^2) | Space O(1)

# Improved: Create a hashmap, for each number, set (target - num) as the key and index as value
# If num is available, return the current index and the value for the num in the hashmap
# Time O(n) | Space O(n)
def twoSum(nums, target):
    target_table = {}
    for index, num in enumerate(nums):
        if num in target_table:
            return [index, target_table[num]]
        target_table[target - num] = index


# nums = [2,7,11,15]
# target = 9
# nums = [3,2,4]
# target = 6
nums = [3,3]
target = 6
print(twoSum(nums, target))