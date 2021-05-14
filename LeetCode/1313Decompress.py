# https://leetcode.com/problems/decompress-run-length-encoded-list
# Time O(n) | Aux space O(sum of all the odd position values in nums)
def decompressRLElist(nums):
    result = []
    index = 0
    while index<len(nums):
        result.extend([nums[index+1]]*nums[index])
        index += 2
        
    return result

nums = [int(num) for num in input().split()]
print(decompressRLElist(nums))