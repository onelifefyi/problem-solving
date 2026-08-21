# https://leetcode.com/problems/contains-duplicate/

# Approach:
# The simplest approach I can think of is have a nested loop to compare each elements
# Time O(n^2) | Space O(1)

# Better:
# Using sets, I can keep inserting the element, if it already exists return true
# Time O(n) | Space O(n)

def containsDuplicate(nums):
    exists = set()
    for num in nums:
        if num in exists:
            return True
        exists.add(num)
    return False

nums = [1,1,1,3,3,4,3,2,4,2]
print(containsDuplicate(nums))
