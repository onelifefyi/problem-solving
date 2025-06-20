# https://leetcode.com/problems/maximum-subarray/

# Approach:
# For each variable, compare that value with total, if total + curr < curr, make total = curr
# Keep track of max
# Return max
# Time O(n) | Space O(1)

def maxSubArray(nums):
    total = nums[0]
    max_total = nums[0]
    for num in nums[1:]:
        total += num
        if total < num:
            total = num
        max_total = max(total, max_total)
    return max_total


nums = [-2,1,-3,4,-1,2,1,-5,4]
nums = nums = [1]
nums = [5,4,-1,7,8]
print(maxSubArray(nums))
