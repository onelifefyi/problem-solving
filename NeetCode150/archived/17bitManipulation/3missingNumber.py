# https://leetcode.com/problems/missing-number/

# Approach:
# Sort the list and then check for missing
# Time O(nlogn) | Space O(1)

# Approach:
# We can utilize the XOR operator
# Performing XOR operation with the number itself produces 0
# So, out of the given list perform XOR with:
# First, among themselves
# Second, all the integers from 1 - n
# This will make the missing number the only number without duplicate, leaving that to be XORed with 0
# Time O(n) | Space O(1)
def missingNumber(nums):
    result = 0
    for num in nums:
        result = result ^ num
    for i in range(len(nums) + 1):
        result = result ^ i
    return result

# Approach:
# Utilizing the sum of first n natural numbers using mathematical formula
# Calculate the expeced sum, substract the actual sum from it
# This will provide the solution
# Time O(n) | Space O(1)

# nums = [3,0,1]
nums = [9,6,4,2,3,5,7,0,1]
print(missingNumber(nums))