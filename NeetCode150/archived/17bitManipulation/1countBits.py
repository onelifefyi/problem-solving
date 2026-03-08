# https://leetcode.com/problems/counting-bits/

# Approach:
# First is brute force, count num for each numbers till n


# Approach:
# We can use a form of DP, to keep storing the num of bits for initial numbers, and we know that it repeats
# After that power of 2 is complete with addition of one more bit
# Time O(n) | Space O(n)

def countBits(n):
    # It starts with:
    num_bits = [0]
    curr = 1
    while curr <= n:
        for i in range(curr):
            num_bits.append(1 + num_bits[i])
        curr = curr << 1
    return num_bits[:n+1]

# n = 5
# n = 2
n = 16
print(countBits(n))