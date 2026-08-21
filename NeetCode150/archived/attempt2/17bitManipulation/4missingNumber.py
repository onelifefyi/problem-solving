# https://leetcode.com/problems/missing-number/

# Approach:
# Similar to finding single number that isn't duplicate, can do two pass
# One pass to get XOR of all numbers from 1 to n
# Then 2nd pass, XOR from the provided list, the value left will be the missing num
# Time O(n) | Space O(1)

# Approach: 
# After thinking, I can do this in single pass as well, just use one loop
# XOR with index before adding to res
# Time O(n) 1 pass | Space O(1)
# def missingNumber(nums: list[int]) -> int:
#     res = 0
#     for i, num in enumerate(nums):
#         res ^= i ^ num
#     return res ^ len(nums)

# Approach: Math
# We know sum of first n natural numbers = n*(n+1)//2
def missingNumber(nums: list[int]) -> int:
    n = len(nums)
    expected = n*(n+1)//2
    return expected - sum(nums)


nums = [9,6,4,2,3,5,7,0,1]
print(missingNumber(nums))