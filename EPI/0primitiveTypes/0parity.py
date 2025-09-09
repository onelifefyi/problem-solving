# Approach:
# Brute - Keep checking the last bit of the number (& with 1), and count the number of set bits
# Keep shifting the number by 1 
# Time O(x) where x in #bits | Space O(1)

# def parity(x: int) -> int:
#     set_bits = 0
#     while x:
#         set_bits += x & 1
#         x >>= 1
#     return set_bits % 2

# Approach:
# Can improve the performance by checking only the set bits
# This can be achieved by performing the & operation like: num & (num - 1)
# This un-sets the last bit, this works because num - 1, changes all the non set bits to 1 until a set bit is reached
# That set bit becomes unset!! Hence performing & operation will unset the last set bit
# Time O(y) where y is the number of set bits | Space O(1)

def parity(x: int) -> int:
    set_bits = 0
    while x:
        set_bits += 1
        x = x & (x-1)
    return set_bits%2

# Approach:
# Another way to improve this is by having a cache
# Store the parity of all the possible 16 bit numbers
# And when calculating for a bigger number, say 64 bits, split it in 16 + 16 + 16 + 16 bits
# Get the parity from cache of individual 16 bits from cache and then find parity of result
# This works because of the associative nature of parity (only cares about # of 1s not order)
# Time O(1) depending on the size, but still | Space O(1) to store 2^16 number's parity on the cache


# Another approach, lol:
# This is through the working of internal bitwise XOR operator
# XOR is associative, that means the order doesn't matter
# So, can take half the bits and perform XOR with the other half
# Keep repeating this process of halving and XORing, to get one final parity
# XOR -> 1 if both the numbers are different, otherwise 0.
# In essence, if there are even number of 1s, it will result in 0, otherwise it will result in 1 left.
# Time O(logx) where x is number of bits | Space O(1)

# Assumming 32 bit integer (Python3)
def parity(x: int) -> int:
    # x = x ^ (x >> 32) # for 64 bits
    x = x ^ (x >> 16)
    x = x ^ (x >> 8)
    x = x ^ (x >> 4)
    x = x ^ (x >> 2)
    x = x ^ (x >> 1)
    return x & 1

x = int(input())
print(parity(x))