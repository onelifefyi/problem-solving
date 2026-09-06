# https://leetcode.com/problems/last-stone-weight/description/

# Approach:
# I can build a max heap (-1 multiplication), then keep iterating till length is <= 2

# Time O(nlogn) | Space O(1)

from heapq import heappush, heappop, heapify
def lastStoneWeight(stones):
    stones = [-1 * stone for stone in stones]
    heapify(stones)
    while len(stones) >= 2:
        big = heappop(stones) * -1
        small = heappop(stones) * -1
        if big != small: heappush(stones, (big - small) * -1)
    return stones[0] * -1 if stones else 0


