# EPI page 27

# Brute approach, we can represent all the bits of a number on an array & swap
# time O(1) | space O(k) where k is the bits needed to represent the number in binary

# Another approach, based on i & j, perform and operation with 2^i and 2^j.
# This way we know if the bit in ith or jth position is set to 0 or 1
# Based on this perform the operation to set to 0 or 1 using bitwise operator
# time O(1) | space O(1)
# def swap_bits(num, i, j):
#     # 'AND' bit masking to fetch the ith and jth bit
#     check_i = 1 if (2**i & num) else 0
#     check_j = 1 if (2**j & num) else 0

#     # If both the bits are same, no need to swap
#     if check_i == check_j:
#         return num

#     # if ith bit is 1 then perform 'OR' operation with 1 on jth bit
#     # else set the jth bit to 0, by substracting by (2**j)*check_j
#     # note that we are multiplying by check_j b'cos if we substract when it's
#     # already zero, will result in changes in other bits
#     if check_i:
#         num = num | (2**j)
#     else:
#         num = num - (2**j)*check_j

#     # similar to what we did above
#     if check_j:
#         num = num | (2**i)
#     else:
#         num = num - (2**i)*check_i
#     return num

# Same as above but just fixing the complex if else part with intuitive approach
# def swap_bits(num, i, j):
#     check_i = 1 if (2**i & num) else 0
#     check_j = 1 if (2**j & num) else 0

#     if check_i == check_j:
#         return num

#     # Here instead of complex if else we are setting the bit to 1
#     # by 'OR' operation with 2**x and setting the bit to 0
#     # by 'AND' operation with ~(2**x)
#     num = (num | 2**j) if check_i else (num & ~(2**j))
#     num = (num | 2**i) if check_j else (num & ~(2**i))  
#     return num

# More intuitive approach, we don't need to swap if both the bits are same
# And if they are different, we just flip them in position
def swap_bits(num, i, j):
    # neat trick to find if bit at x position is set or not
    # right shift it by x and perform 'AND' operation with 1
    # Below, checking if both are same or not
    if ((num >> i) & 1) != ((num >> j) & 1):
        # we now know that both the bits are different, so swap
        # bit mask with ith and jth bit set to 1
        mask = (1 << i) | (1 << j)
        # if we perform XOR operation with bitmask, it'll swap current value
        num = num ^ mask
    return num

inp = input().split()
num, i, j = int(inp[0]), int(inp[1]), int(inp[2])
print("Before: ", num, bin(num))
swap_num = swap_bits(num, i, j)
print("After: ", swap_num, bin(swap_num))