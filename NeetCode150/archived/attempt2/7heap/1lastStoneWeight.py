# https://leetcode.com/problems/last-stone-weight/

# Approach:
# Sort the array, and keep performing the operation till the last one from the head, maintaing the sorted array
# By inserting the new stone in correct location
# Time O(nlogn + n^2) | Space O(1)

# Approach:
# Using heaps can reduce time, heapify() - O(n), heappush() and heappop() take O(logn), doing this n times
# Time O(nlogn) | Space O(n)

import heapq
class Solution:
    def lastStoneWeight(self, stones: list[int]) -> int:
        stones = [-1 * num for num in stones]
        heapq.heapify(stones)
        while len(stones) >= 2:
            s1 = heapq.heappop(stones)
            s2 = heapq.heappop(stones)
            left = s1 - s2
            if left: heapq.heappush(stones, left)
        if stones: return stones[0] * -1
        else: return 0

