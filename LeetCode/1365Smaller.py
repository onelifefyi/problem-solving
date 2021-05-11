# https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/


# Time O(n^2) | Space O(n)
# def smallerNumbersThanCurrent(nums):
#     lst = sorted(nums)
#     for index, num in enumerate(nums):
#         i = 0
#         while i<len(nums):
#             if lst[i] >= num:
#                 break
#             else:
#                 i += 1
#         nums[index] = i
#     return nums

# Time O(nlogn) | Space O(n)
def smallerNumbersThanCurrent(nums):
    lst = sorted(nums)
    dictOfNum = {}
    result = []
    for i in range(0, len(nums)):
        if lst[i] not in dictOfNum:
            dictOfNum[lst[i]] = i
            result.append(i)
    result = [dictOfNum[num] for num in nums]
    return result



nums = [int(num) for num in input().split()]
print(smallerNumbersThanCurrent(nums))