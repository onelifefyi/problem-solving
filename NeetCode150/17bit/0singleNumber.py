# https://leetcode.com/problems/single-number/

# Approach:
# Classic problem, simply XOR everything, cos we know that x XOR x == 0
# Time O(n) | Space O(1)

def singleNumber(nums):
    res = 0
    for num in nums:
        res ^= num
    return res

nums = [4,1,2,1,2]
print(singleNumber(nums))
