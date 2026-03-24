# https://leetcode.com/problems/top-k-frequent-elements/

# Approach:
# Use hashmap to get frequency of all the num in nums
# Also, keep track of max freq
# then, create an array of size max freq, keep inserting the [value] into it
# Finally, traverse the array from back till you get k elements

# Time O(n) insert to hashmap, traverse the map and insert to array
# Space O(n)
from collections import defaultdict
def topKFrequent(nums, k):
    numFreq = defaultdict(int)
    maxFreq = 0
    for num in nums:
        numFreq[num] += 1
        maxFreq = max(maxFreq, numFreq[num])
    occArr = [[] for _ in range(maxFreq + 1)]
    for key, freq in numFreq.items(): occArr[freq].append(key)
    res = []
    for i in range(maxFreq, 0, -1):
        while occArr[i]:
            if len(res) == k: return res
            res.append(occArr[i].pop())
    return res




nums = [1,2, 8,8,8,8,8,0,0,0,0,0,0,0,0,8,8,8,8,8,1,2,1,2,3,1,3,2]
k = 3
print(topKFrequent(nums, k))