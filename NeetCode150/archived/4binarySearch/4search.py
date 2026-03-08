# https://leetcode.com/problems/search-in-rotated-sorted-array/description/

# Approach:
# Imagine that the list is divided into two sorted lists
# left, right = 0, len(list) - 1
# Two stages, first decide which list, then decide which direction
# Keem moving towards the target, if target found, return index
# Otherwise (left > right), return -1
# Time O(logn) | Space O(1)
def search(nums, target):
    left, right = 0, len(nums) - 1
    while left <= right:
        # Decide case/side
        mid = (left + right)//2
        if nums[mid] == target: return mid
        if nums[left] <= nums[mid]:
            # We're in left sorted sub-list
            if target > nums[mid] or target < nums[left]:
                left = mid + 1
            else:
                right = mid - 1
        else:
            # We're in the right sorted sub-list
            if target < nums[mid] or target > nums[right]:
                right = mid - 1
            else:
                left = mid + 1
    return -1
nums = [4,5,6,7,0,1,2]
target = 0
# nums = [3, 1]
# target = 1
# nums = [5, 1, 3]
# target = 5
print(search(nums, target))