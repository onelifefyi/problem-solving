# https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

# Use the first number to decide weather min is at left or right
# perform binary search
# Time O(logn) | Space O(1)
def findMin(nums):
    # If already sorted
    if nums[0] < nums[-1] or len(nums) == 1:
        return nums[0]
    # Otherwise, bin search
    left = 0
    right = len(nums) - 1
    while right > left:
        index = (left + right)//2
        if nums[index] > nums[index + 1]:
            return nums[index + 1]
        if nums[index] < nums[left]:
            right = index
        else:
            left = index + 1
        

nums = [3,4,5,1,2]
nums = [4,5,6,7,0,1,2]
nums = [11,13,15,17]
print(findMin(nums))