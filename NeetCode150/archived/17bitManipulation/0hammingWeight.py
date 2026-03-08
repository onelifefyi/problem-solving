# https://leetcode.com/problems/number-of-1-bits/


# Approach:
# Simplest, keep checking the right most bit as you keep right shifting.
# Time O(num bits) | Space O(1)

# Approach:
# There's one way to truncate the right most bit from a given number
# Whatever is num - 1 will have all the bits set except the last one
# All the other bits to the left remains the same
# We can keep utilizing this to remove the last set bit each time
# This can be performed by using the AND operator (cos everything left of the last set bit is same)
# Time O(num set bits) | Space O(1)
def hammingWeight(n):
    count = 0
    while n:
        n = n & (n - 1)
        count += 1
    return count

# n = 128
n = 2147483645
print(hammingWeight(n))