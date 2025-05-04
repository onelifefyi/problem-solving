# https://leetcode.com/problems/longest-consecutive-sequence/

# Approach:
# Sort the list, find the subsequence
# Time O(nlogn) | Space O(1)

# Approach:
# Instead on relying on the given list of numbers, we can identify what all numbers are start of the sequence
# This can be achieved by checkinig if num-1 exists or not in the given array (for efficient search, we use hashset)
# Keep track of max, as you build the sequence
# Time O(n) | Space O(n)
def longestConsecutive(nums):
    num_set = set()
    for num in nums: num_set.add(num)

    max_length = 0
    for num in nums:
        if num-1 not in num_set:
            length = 1
            next_num = num+1
            while next_num in num_set: 
                length += 1
                next_num += 1
            max_length = max(max_length, length)
    return max_length


# nums = [100,4,200,1,3,2]
# nums = [0,3,7,2,5,8,4,6,0,1]
nums = [1,0,1,2]
print(longestConsecutive(nums))