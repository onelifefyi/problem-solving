# https://leetcode.com/problems/longest-consecutive-sequence/

# Approach:
# Most straight-forward, sort the array, then do another pass to find longest subsequence
# Time O(nlogn) | Space O(1)

# Better
# Store every number in a set
# Do a second pass, this time if the num is the first element (num-1 doesn't exist), start counting (or storing in res)

# Time O(n) | Space O(n)
def longestConsecutive(nums):
    numSet = set(nums)
    maxLen = 0
    for num in numSet:
        if (num - 1) not in numSet:
            length = 0
            curr = num
            while curr in numSet:
                length += 1
                curr += 1
            if length > maxLen: maxLen = length
    return maxLen


# Test cases
nums1 = [100, 4, 200, 1, 3, 2]
print(longestConsecutive(nums1)) # Expected: 4 (1, 2, 3, 4)

nums2 = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]
print(longestConsecutive(nums2)) # Expected: 9 (0, 1, 2, 3, 4, 5, 6, 7, 8)
