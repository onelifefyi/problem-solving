# https://leetcode.com/problems/binary-search/description/

# Approach:
# Simple: go through all the elements, return the index if taget is found
# Time O(n) | Space O(1)

# Binary search
# Given that it's a sorted array, we can perform binary search
# Divide the list in half each time going either left or right till the target is found
# Time O(logn) | Space O(1)


def search(nums, target):
    left, right = 0, len(nums) - 1

    while left <= right:
        mid = (left + right)//2
        if nums[mid] == target:
            return mid
        if nums[mid] > target:
            right = mid - 1
        else:
            left = mid + 1
    return -1

nums = [-1,0,3,5,9,12]
target = 9
print(search(nums, target))
