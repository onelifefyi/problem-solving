# https://leetcode.com/problems/single-number/

# Approach
# Brute way would be to create like a set and keep adding and removing
# Time O(n) | Space O(n)

# Can optimize for space using bit operation XOR
# XOR between two equal numbers is 0
# So, keep XORing every number together, the remaining number is single
# Time O(n) | Space O(1)
def singleNumber(nums):
    final = 0
    for num in nums: final ^= num
    return final

nums = [4,1,2,1,2]
print(singleNumber(nums))
