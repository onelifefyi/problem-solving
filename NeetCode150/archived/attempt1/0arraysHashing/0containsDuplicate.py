# https://leetcode.com/problems/contains-duplicate/

# Approach:
# Check all possible pairs
# Time O(n^2) | Space O(1)

# Approach:
# Use a set to keep storing each number, if duplicate appears return True
# Time O(n) | Space O(n)

def containsDuplicate(nums):
	num_set = set()
	for num in nums:
		if num in num_set:
			return True
		num_set.add(num)

	return False


nums = [1,1,1,3,3,4,3,2,4,2]
print(containsDuplicate(nums))
