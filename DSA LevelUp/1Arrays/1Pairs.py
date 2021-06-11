# https://leetcode.com/problems/two-sum/

# Brute
#def twoSum(nums, target):
#    for i in range(len(nums)):
#        for j in range(i, len(nums)):
#            if nums[i]+nums[j] == target:
#                return [i,j]

def twoSum(nums, target):
    seen = {}
    for index, value in enumerate(nums):
        requiredSum = target-value
        if requiredSum in seen:
            return [seen[requiredSum], index]
        else:
            seen[value] = index

print(twoSum(nums=[2,7,11,15], target=9))
print(twoSum(nums=[3,2,4], target=6))
print(twoSum(nums=[3,3], target=6))