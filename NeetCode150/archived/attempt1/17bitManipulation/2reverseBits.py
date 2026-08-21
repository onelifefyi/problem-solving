# https://leetcode.com/problems/reverse-bits/

# Approach:
# Simplest way
# Go through each bit, build the reversed num bit by bit
# Time O(num bits) | Space O(1)

def reverseBits(n):
    result = 0
    for _ in range(32):
        bit = n & 1
        n = n >> 1
        result = result << 1
        result = result | bit
    return result

n = 43261596
# print(bin(n))
print(reverseBits(n))