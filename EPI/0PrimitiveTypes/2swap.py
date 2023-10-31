# Create a mask for position i & j
# If the values at ith & jth index are different, switch the bits by performing XOR with 1 (can use mask)
# Time O()

def swap_bits(x, i, j):
    if (x >> i) & 1 != (x >> j) & 1:
        mask = (1 << i) | (1 << j)
        x ^= mask
    return x

print(swap_bits(10, 3, 0))