# https://leetcode.com/problems/create-target-array-in-the-given-order/

# Time O(insertion in python * n)
def createTargetArray(nums, index):
    result = []
    for i in range(0, len(nums)):
        result.insert(index[i], nums[i])
    return result

nums = [int(num) for num in input().split()]
index = [int(num) for num in input().split()]

print(createTargetArray(nums, index))