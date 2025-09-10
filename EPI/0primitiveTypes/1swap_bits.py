# Approach:
# First step would be to extract the ith and jth bit (use bitmask)
# If equal, don't do anyting
# If un-equal, perform XOR with 1 (same position bit mask) to perform the swap
# Time O(1) | Space O(1)
def swap_bits(x, i, j):
    to_swap = ((x >> i) & 1) != ((x >> j) & 1)
    if to_swap:
        mask = (1 << i) | (1 << j)
        x = x ^ mask

    return x

x, i, j = 73, 1, 6
print(swap_bits(x, i, j))