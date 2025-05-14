# https://leetcode.com/problems/binary-search/description/

# Approach:
# Just perform binary search, lol
def search(nums, target):
    l, r = 0, len(nums) - 1
    while l <= r:
        mid = (l + r) // 2
        if nums[mid] == target: return mid
        elif nums[mid] < target: l = mid + 1
        else: r = mid - 1
    return -1


nums = [-1,0,3,5,9,12]
target = 9
# nums = [-1,0,3,5,9,12]
# target = 2
# nums = [61]
# target = 61
print(search(nums, target))