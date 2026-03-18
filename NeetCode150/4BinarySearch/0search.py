# https://leetcode.com/problems/binary-search/

# Approach
# I mean... just implement binary search
# Time O(logn) | Space O(1)
def search(nums, target):
    left, right = 0, len(nums) - 1
    while left <= right:
        mid = (left + right) // 2
        if nums[mid] == target: return mid
        if target < nums[mid]: right = mid - 1
        else: left = mid + 1
    return -1


nums = [-1,0,3,5,9,12]
target = 9
print(search)