# https://leetcode.com/problems/contains-duplicate/

# Approach:
# The most straightforward approach would be to compare every element to look for duplicate
# Time O(n^2) | Space O(1)

# A better approach would be to have a hash-set to store the visited items, if duplicate return true
# Time O(n) | Space O(n)
def containsDuplicate(nums):
    visited_set = set()
    for num in nums:
        if num in visited_set: return True
        visited_set.add(num)
    return False

# nums = [1,1,1,3,3,4,3,2,4,2]
nums = [1, 2, -5, 4]
print(containsDuplicate(nums))
