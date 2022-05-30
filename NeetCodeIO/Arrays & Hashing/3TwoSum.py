# https://leetcode.com/problems/two-sum/

# Approach: Check all possible combination/pairs | no need to repeat (except same index)
# Number of runs -> n, n-1, n-2, n-3.... n times
# Time O(n^2)
# def twoSums(nums, target):
#     i, j = 0, 1
#     while(i<len(nums)-1):
#         j = i+1
#         while(j<len(nums)):
#             if(nums[i] + nums[j] == target):
#                 return [i, j]
#             else:
#                 j += 1
#         i += 1


# Better approach: we can keep track of all the files using dictionary & on every insertion check if sum pair present
# Time O(n) | Space O(n)
def twoSums(nums, target):
    encountered = {}
    for i, value in enumerate(nums):
        difference = target - value
        if difference in encountered:
            return [encountered[difference], i]
        else:
            encountered[value] = i
    return None

nums = [int(num) for num in input().split(' ')]
target = int(input())
print(twoSums(nums, target))