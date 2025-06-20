# https://leetcode.com/problems/jump-game/

# Each step of the way keep track of the remaining distance
# This can be calculated by max(prev - 1, curr)
# Time O(n) | Space O(1)

def canJump(nums):
    left = 1
    for index, num in enumerate(nums):
        left -= 1
        left = max(left, num)
        if left <= 0 and index < len(nums)-1:
            return False
    return True

nums = [2,3,1,1,4]
nums = [3,2,1,0,4]

print(canJump(nums))
