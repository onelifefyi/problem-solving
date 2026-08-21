# https://leetcode.com/problems/contains-duplicate/

# Approach: 
# I can keep storing every element in a hash-set, before each insert, check if already exists, if so return True
# At the end, return False
# Time O(n) | Space O(n)
def containsDuplicate(nums):
    visited_set = set()
    for num in nums:
        if num in visited_set: return True
        visited_set.add(num)
    return False

nums = [1,1,1,3,3,4,3,2,4,2]
print(containsDuplicate(nums))