# https://leetcode.com/problems/reverse-bits/description/

# Approach:
# IDK, what's the internal storage bits for python int, might cause issue
# Simplest approach I can think of is, get one bit at a time, and switch it up
# For the python issue, can have a 32 bit mask

# Time O(1) | Space O(1)
def reverseBits(n):
    res = 0
    for _ in range(32):
        res = (res << 1) | (n & 1)
        n = n >> 1
    return res

n = 43261596
print(reverseBits(n))
