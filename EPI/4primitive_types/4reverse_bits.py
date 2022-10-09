# EPI page 28

# In python it's kinda straight forward, take the string from bin(num),
# reverse it and then make it int(nrev_bin_num, 2)
# def reverse_bits(num):
#     return int(bin(num).replace("0b", "")[::-1], 2)

# # Actual Approach
# # One way is to iterate through have the bits (32 out of 64 bits) and keep
# # swapping like last example '3swap_bits'
# # time O(1) | space O(1)
# def swap_bits(num, i, j):
#     if num>>i & 1 != num>>j & 1:
#         mask = 1<<i | 1<<j
#         num = num ^ mask
#     return num

# # Calling the swap
# def reverse_bits(num):
#     for i in range(32):
#         # print(f"Swapping, {i} with {63-i}")
#         num = swap_bits(num, i, 63-i)
#         # print("num", num)
#         i += 1
#     return num

# Cached approach, improved if there is going to be huge number of input.
# In essense cache is required when we expect the program to be used multiple times
# Time O(1) | Space O(1)
def reverse_bits(num):
    MASK_SIZE = 16
    BIT_MASK = 0xFFFF
    result = (PRECOMPUTED_REVERSE[num & BIT_MASK] << 3*MASK_SIZE) \
    | (PRECOMPUTED_REVERSE[(num>>MASK_SIZE) & BIT_MASK] << 2*MASK_SIZE) \
    | (PRECOMPUTED_REVERSE[(num>>2*MASK_SIZE) & BIT_MASK] << MASK_SIZE) \
    | (PRECOMPUTED_REVERSE[num>>3*MASK_SIZE])
    return result

num = int(input())
print("Before: ", num, bin(num))
num = reverse_bits(num)
print("After: ", num, bin(num))