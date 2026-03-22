# https://leetcode.com/problems/kth-largest-element-in-a-stream/


# Approach:
# First step would be to initialize
# Need 2 list, one will have top k scores
# The second will have the rest of the scores lower than top k
# We don't care much about the second list, can be in any order
# Each time a new score is add() added, need to check where will it go
# If goes in the second list, simply insert, and return first element of first list (sorted increasing order)
# If goes in the first list, move the first element of the first list to second list, and insert in correct location of 1st list
# Time: init = O(nlogn); add = O(k + logk) = O(k)
# Space: init = O(n); add = O(1)

# Wow! This was a weird implementation - lot's of revision for edge case where init isn't atleast k
# class KthLargest:

#     def __init__(self, k: int, nums: List[int]):
#         self.needed = k
#         self.rest = []
#         self.topk = []
#         self.rest = sorted(nums)
#         while self.needed > 0:
#             if self.rest: 
#                 self.topk.append(self.rest.pop(-1))
#                 self.needed -= 1
#             else: break
        
#     def add(self, val: int) -> int:
#         inserted = False
#         if not self.topk: 
#             self.topk.append(val)
#             self.needed -= 1
#         elif self.needed > 0:
#             for i in range(len(self.topk)):
#                 if self.topk[i] < val:
#                     self.topk.insert(i, val)
#                     inserted = True
#                     break
#             if not inserted:
#                 self.topk.append(val)
#             self.needed -= 1
#         elif self.topk[-1] < val:
#             for i in range(len(self.topk)):
#                 if self.topk[i] < val:
#                     self.topk.insert(i, val)
#                     break
#             self.rest.append(self.topk.pop(-1))
#         else: self.rest.append(val)
#         return self.topk[-1]


# Actually, we don't even need the rest, lol
# The list only grows
# class KthLargest:

#     def __init__(self, k: int, nums: list[int]):
#         self.needed = k
#         self.topk = []
        
#         sorted_nums = sorted(nums)
#         while self.needed > 0:
#             if sorted_nums: 
#                 self.topk.append(sorted_nums.pop(-1))
#                 self.needed -= 1
#             else: break
        
#     def add(self, val: int) -> int:
#         inserted = False
#         if not self.topk: 
#             self.topk.append(val)
#             self.needed -= 1
#         elif self.needed > 0:
#             for i in range(len(self.topk)):
#                 if self.topk[i] < val:
#                     self.topk.insert(i, val)
#                     inserted = True
#                     break
#             if not inserted:
#                 self.topk.append(val)
#             self.needed -= 1
            
#         elif self.topk[-1] < val:
#             for i in range(len(self.topk)):
#                 if self.topk[i] < val:
#                     self.topk.insert(i, val)
#                     break
#             self.topk.pop(-1) 
#         return self.topk[-1]


# Approach
# Using heaps (always keeps the min element on top (index 0)) - quite optimal inserts and pops
# Time init: O(nlogn); add: O(mlogk) where m is # of adds
# Space: O(k), only storing k elements
import heapq
class KthLargest:

    def __init__(self, k: int, nums: list[int]):
        self.k = k
        nums.sort(reverse = True)
        self.topk = nums
        # if len(self.topk) <= k: heapq.heapify(self.topk)
        # else: 
        #     self.topk = self.topk[:k]
        #     heapq.heapify(self.topk)
        # No need of this, python handles 
        self.topk = nums[:k] 
        heapq.heapify(self.topk)


    def add(self, val: int) -> int:
        if len(self.topk) < self.k:
            heapq.heappush(self.topk, val)
        elif val > self.topk[0]:
            heapq.heappush(self.topk, val)
            heapq.heappop(self.topk)
        return self.topk[0]

            
# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)