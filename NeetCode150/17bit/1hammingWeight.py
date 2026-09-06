# https://leetcode.com/problems/number-of-1-bits/description/

# Approach:
# We know that to unset the last set bit we can do num & (num -1), keep doing this num == 0
# Time O(x), where x is num of set bits | Aux space O(1)

def hammingWeight(n):
    count = 0
    while n:
        n = n & (n-1)
        count += 1
    return count

n = 128
print(hammingWeight(n))
