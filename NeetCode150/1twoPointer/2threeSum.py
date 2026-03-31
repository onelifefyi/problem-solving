# https://leetcode.com/problems/3sum/

# Approach:
# First, sort the array
# Now, for each unique num, can solve 2 sum problem using two pointers
# Time O(nlogn) | Space O(n)

# Still has duplicate problem
def threeSum(nums):
    res = []
    nums.sort()
    last = None
    left, right = 0, len(nums) - 1
    for i, num in enumerate(nums):
        if num == last: continue
        left = i + 1
        right = len(nums) - 1
        while left < right:
            if num + nums[left] + nums[right] < 0: left += 1
            elif num + nums[left] + nums[right] > 0: right -= 1
            else: 
                res.append([num, nums[left], nums[right]])
                left += 1
        last = num
    return res


# Test cases
nums1 = [-1, 0, 1, 2, -1, -4]
print(threeSum(nums1)) # Expected: [[-1, -1, 2], [-1, 0, 1]]

nums2 = [0, 1, 1]
print(threeSum(nums2)) # Expected: []

nums3 = [0, 0, 0]
print(threeSum(nums3)) # Expected: [[0, 0, 0]]

nums4 = [0,0,0,0]
print(threeSum(nums4))