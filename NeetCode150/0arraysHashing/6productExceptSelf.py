# https://leetcode.com/problems/product-of-array-except-self/

# Approach:
# Simplest thing would be to do one traversal for each element
# Time O(n^2) | Space O(1)

# Better: Perform two pass, keeping track of running product
# One from left, and the other from right
# Keep storing it in res array
# Time O(n) | Space O(n)
def productExceptSelf(nums):
    prod = 1
    left = 0
    res = [1] * len(nums)
    while left < len(nums):
        res[left] *= prod 
        prod *= nums[left]
        left += 1
    # print(nums)
    prod = 1
    right = len(nums) - 1
    while right >= 0:
        res[right] *= prod 
        prod *= nums[right]
        right -= 1
    return res

# nums = [1,2,3,4]
nums = [-1,1,0,-3,3]
print(productExceptSelf(nums))

