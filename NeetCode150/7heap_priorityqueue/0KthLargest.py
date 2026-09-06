# https://leetcode.com/problems/kth-largest-element-in-a-stream/

# Approach:
# Two phases
# First, build the initial list nums, keeping track of kth largest
# I'm thinking two heap, one keeps the max on top, second, to keep pushing
# The k + 1th top score

# __init__
# Time O(nlogk) | Space O(k)

# add
# Time O(logk) if inserting | Space O(1)
from heapq import heapify, heappush, heappop
class KthLargest:
    def __init__(self, k: int, nums: List[int]):
        self.heap = []
        self.k = k
        for num in nums:
            self.add(num)

    def add(self, val: int) -> int:
        if len(self.heap) < self.k:
            heappush(self.heap, val)
            return self.heap[0]
        if self.heap[0] < val:
            heappop(self.heap)
            heappush(self.heap, val)
        return self.heap[0]

# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)
