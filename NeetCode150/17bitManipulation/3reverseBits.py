# https://leetcode.com/problems/reverse-bits/

# Approach:
# Simplest - convert to bin, reverse it, convert back
# Not the most optimal

# Another Approach:
# Keep getting the last bit by & with 1
# Then, use that to build the reversed num
# Time O(1) | Space O(1)
def reverseBits(n: int) -> int:
    res = 0
    for i in range(32):
        res = (res << 1) | (n & 1)
        n >>= 1
    return res

n = 43261596
print(reverseBits(n))