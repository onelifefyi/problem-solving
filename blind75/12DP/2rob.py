# https://leetcode.com/problems/house-robber-ii/
# Time O(n) | Space O(n)

def newRob(nums):
    def rob(nums):
        max_now = 0
        max_prev = 0
        for num in nums:
            temp = max_prev + num
            max_prev = max_now
            max_now = max(max_now, temp)
        return max_now
    return max(rob(nums[1:]), rob(nums[:-1]), nums[0])

nums = [2,3,2]
print(newRob(nums))
