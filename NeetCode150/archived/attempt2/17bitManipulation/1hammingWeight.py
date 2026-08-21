# https://leetcode.com/problems/number-of-1-bits/

# Approach:
# The brute approach would be to first convert to binary
# Then count the num of 1s
# Can use internal python tool as well, that's not fun

# Better:
# Can use bit technique
# Performing n & (n-1) removes the last set bit
# Keep doing this till n becomes 0, keep count of operations
# Time O(b), where b is the # of set bits | Space O(1)
def hammingWeight(n: int) -> int:
    count = 0
    while n:
        n &= (n-1)
        count += 1
    return count
