# https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

# Brute:
# Check all possible combinations
# Time O(n^2) | Space O(1)

# Better:
# Use hashmaps
# Store (target - num) paired with index in hasmap
# Everytime new value appears, check if it exists in hashmap
# If it matches, return the values
# That's stupid of me, didn't read that it's sorted
# Time O(n) | Space O(n)


# Better:
# Have two pointers, left and right
# If the sum is smaller than target, move left, if sum is greater than target, move right
# If matches, return the correct indexes
# Time O(n) | Space O(1)
def twoSum(numbers, target):
    left, right = 0, len(numbers) - 1
    while left < right:
        if numbers[left] + numbers[right] > target: right -= 1
        elif numbers[left] + numbers[right] < target: left += 1
        else: return [left, right]
    return [-1, -1]


        

# Test cases
numbers1 = [2, 7, 11, 15]
target1 = 9
print(twoSum(numbers1, target1)) # Expected: [1, 2]

numbers2 = [2, 3, 4]
target2 = 6
print(twoSum(numbers2, target2)) # Expected: [1, 3]
