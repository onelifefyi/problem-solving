# https://leetcode.com/problems/shortest-unsorted-continuous-subarray/

# Approach: Sort the entire array and then compare sorted and unsorted array to find first and last different position
# Time O(nlogn) | Aux space O(n)
def findUnsortedSubarray(nums):
    sortedNums = sorted(nums)
    lPtr = 0
    rPtr = len(nums)-1
    leftmost = 0
    rightmost = 0

    while(lPtr<len(nums) and nums[lPtr]==sortedNums[lPtr]):
        lPtr += 1
        
    while(rPtr>lPtr and nums[rPtr]==sortedNums[rPtr]):
        rPtr -= 1
    return  rPtr-lPtr+1

# Better Approach: Not solved yet

arr = [int(num) for num in input().split()]
print(findUnsortedSubarray(arr))