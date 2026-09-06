# https://leetcode.com/problems/missing-number/description/

# Approach:
# Simplest way I can think of is keep XORing from 0 to n and the vals
# In the end there will be the only one left without duplicate, that's the val
# Time O(n) | Space O(1)

def missingNumber(nums):
    res = 0
    for i in range(len(nums)):
        res = res ^ i ^ nums[i]
    return res ^ len(nums)

nums = [3, 0, 1]
nums = [9,6,4,2,3,5,7,0,1]
print(missingNumber(nums))
