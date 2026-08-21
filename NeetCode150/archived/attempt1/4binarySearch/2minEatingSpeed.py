# https://leetcode.com/problems/koko-eating-bananas/

# Approach:
# We know that h is always >= len(piles)
# So, the max result is going to be max # bananas in the pile
# Do, a linear search to get the max value
# Then, start with 1 banana up to max value
# Time O(n + max_value*n) = O(max_value*n)

# Improvement:
# Instead of checking all the values from 1 to max_value, we can do binary search
# Time (log(max_value) * n)

import math
def minEatingSpeed(piles, h):
    max_val = 0
    for val in piles:
        max_val = max(max_val, val)
    
    l_banana = 0
    r_banana = max_val

    last_valid = max_val
    while l_banana <= r_banana:
        mid = (l_banana+r_banana)//2
        if mid == 0: break
        total_hours = 0
        for pile in piles: 
            total_hours += math.ceil(pile/mid)
        if total_hours <= h:
            last_valid = min(last_valid, mid)
            r_banana = mid - 1
        else: l_banana = mid + 1
    return last_valid

# piles = [3,6,7,11]
# h = 8
# piles = [30,11,23,4,20]
# h = 5
piles = [30,11,23,4,20]
h = 6
print(minEatingSpeed(piles, h))