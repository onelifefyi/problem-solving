# https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
# Approach:
# Have two pointers, left and right
# Keep moving based on sum being smaller or greater
# If smaller, move left, if greater, move right
# Time O(n) | Space O(1)

def twoSum(numbers, target):
    left, right = 0, len(numbers) - 1
    while left < right:
        total = numbers[left] + numbers[right]
        if total == target: return [left + 1, right + 1]
        if total < target: left += 1
        else: right -= 1
    return -1


# numbers = [2,7,11,15]
# target = 9
# numbers = [2,3,4]
# target = 6
numbers = [-1,0]
target = -1
print(twoSum(numbers, target))