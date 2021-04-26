# https://leetcode.com/problems/maximum-subarray/

# Brute force approach: Check all possible subarrays
# Time O(n^2) | Aux space O(1)
# def maxSubArraySum(arr):
#     max = arr[0]
#     i = 0
#     while(i<len(arr)):
#         j = i
#         temp = 0
#         while(j<len(arr)):
#             temp += arr[j]
#             j += 1
#             if temp > max:
#                 max = temp
#         i += 1
#     return max

# 
def maxSubArraySum(arr):
    maximum = arr[0]
    sum = arr[0]

    i = 1
    while(i<len(arr)):
        sum += arr[i]
        if sum > maximum:
            maximum = sum
        if sum < 0:
            sum = 0

            
#arr = [-2,1,-3,4,-1,2,1,-5,4]
arr = [5,4,-1,7,8]
print(maxSubArraySum(arr))