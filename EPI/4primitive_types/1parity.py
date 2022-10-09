# EPI page 24

# Brute Approach: We can count the number of 1s by performing 'AND' operation
# with 1 and keep on right shifting the num till it becomes 0
# Time O(n) where n is num of bits needed to represent num
# Space O(1)
# def parity(num):
#     ones_count = 0
#     while num:
#         if num & 1 == 1:
#             ones_count += 1
#         num = num >> 1
#     return 0 if ones_count%2 == 0 else 1


# Other approach: We can perform XOR operation on each bits, if there are 
# equal number of ones it'll return 0, else will return one
# time and space same as above approach
# def parity(num):
#     result = 0
#     while num:
#         result = result ^ (num & 1)
#         num = num >> 1
#     return result


# Neat Trick: The cool thing about x&(x-1) is that it always makes the last
# bit that is 1 to 0. So if we keep on performing this operation, we will
# only need to iterate the number of times 1 is present in the number.
# time O(k) where k is the number of set bits
# space O(1)
# <extra> Another cool trick is x & ~(x-1), this removes all the 1s except
# the last one, so, eg. 10(0b1010) & ~9 = (0b00010), i.e, it removed all
# the 1s except the last one 

# def parity(num):
#     result = 0
#     while num:
#         num = num & (num-1)
#         result = result ^ 1
#     return result

# Another technique, when we know that there is going to be alot of input 
# numbers, it's much better to store (cache) some subset of all possible combinations
# We can't store all possible parity result for 64 bits, that's way too much
# but we can store all possible parity result of 16 bit number
# divide the 64 bits input into 4 parts, lookup parity from cache and then XOR them
# Note that here we are assuming that the cache is provided, say "PRECOMPUTED_PARITY"

# Time O(1) | Space O(1) 
# Assuming that PRECOMPUTED_PARITY is provided, note that the below program won't actually work

# def parity(num):
#     # The division size, will be shifting with this multiplier
#     MASK_SIZE = 16
#     # BIT_MASK will be required to extract only significant bits, here 0xFFFF = 16 bit long 1s
#     BIT_MASK = 0xFFFF

#     result = PRECOMPUTED_PARITY[num >> 3*MASK_SIZE] \
#     ^ PRECOMPUTED_PARITY[(num >> 2*MASK_SIZE) & BIT_MASK] \
#     ^ PRECOMPUTED_PARITY[(num >> MASK_SIZE) & BIT_MASK] \
#     ^ PRECOMPUTED_PARITY[num & BIT_MASK]
#     return result

# Another way, we can subdivide the given number by 1/2 and perform XOR operation,
# We keep on dividing till we get to 1 digit and the last bit will be the parity

# Time O(1) | Space O(1)
def parity(num):
    # We will keep on taking half the bits of the number and keep on storing it on itself
    # Will follow this till the result is reduced to 1
    num = num ^ num>>32
    num = num ^ num>>16
    num = num ^ num>>8
    num = num ^ num>>4
    num = num ^ num>>2
    num = num ^ num>>1
    # since the result is stored in the last bit
    return num & 1

num = int(input())
print(parity(num))