# https://leetcode.com/problems/product-of-array-except-self/description/

# Approach:
# The simplest way would be to create another array and for each element generate the result
# Time O(n^2) | Space O(n)

# Approach:
# Two pass approach using pointers
# Keep track of prod so far while building the results array (left to right)
# Second pass, going from right to left, keep track of prod so far and multiply and equate with results[index]
# Time O(n) | Space O(n)
def productExceptSelf(nums):
    result = [1] * len(nums)
    
    prod_so_far = 1
    index = 0
    while index < len(nums):
        result[index] = prod_so_far
        prod_so_far *= nums[index]
        index += 1

    prod_so_far = 1
    index = len(nums)-1
    while index >= 0:
        result[index] *= prod_so_far
        prod_so_far *= nums[index]
        index -= 1
    return result


nums = [1,2,3,1]
print(productExceptSelf(nums))