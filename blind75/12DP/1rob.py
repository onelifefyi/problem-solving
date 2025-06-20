# https://leetcode.com/problems/house-robber/

# Approach:
# For each item, the max so far is going to be either
# 1st - sum of item and max till 2 before (robbing current item + max till 2 before)
# 2nd - max so far (cos, we won't be robbing the current item)
# Time O(n) | Space O(1)

def rob(nums):
    max_till_now = 0
    max_till_prev = 0
    for num in nums:
        temp = num + max_till_prev
        max_till_prev = max_till_now
        max_till_now = max(max_till_now, temp)
    return max_till_now

nums = [1,2,3,1]
print(rob(nums))
nums = [2,7,9,3,1]
print(rob(nums))
