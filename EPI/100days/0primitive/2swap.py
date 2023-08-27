# Time O(1)
# Space O(1)
# Thing to remember -> can swap bits by XOR with 1; Can perform swap at multiple position by using mask combined with ORed numbers.

def swap_bits(x, i, j):
    # check if swap is required or not
    if (x >> i) & 1 != (x >> j) & 1:
        # create mask
        mask = (1 << i) | (1 << j)
        x = x ^ mask
    return x

print(swap_bits(8, 1, 3))