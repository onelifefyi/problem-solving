# https://leetcode.com/problems/two-sum/

# Approach:
# Use a hash-map to store the value and index of the visited elements
# Now, if (target - current_element) exists in the hash-map, return the indices
# At the end of the loop, return -1 (not found)
# Time O(n) | Space O(n)

def twoSum(nums, target):
    visited_map = {}
    for i, num in enumerate(nums):
        if (target - num) in visited_map:
            return [visited_map[target - num], i]
        visited_map[num] = i
    return [-1, -1]


nums = [2,7,11,15]
target = 222
print(twoSum(nums, target))
