# Brute: Go through each bit
# O(n)
# def findParity(num):
#     result = 0
#     while num:
#         result = result ^ (num & 1)
#         num = num >> 1
#     return result


# Reduce the complexity to k where k is the number of set bits
# X & (X-1) gives X with it's last set bit removed
# Since X-1 sets all the unset bit to 1 till a set bit is encountered & sets it to zero
# def findParity(num):
#     result = 0
#     while num:
#         result = result ^ 1
#         num = num & (num-1)
#     return result


# Can improve this by using some memory, like storing parity of every possible 16 bits word (2^16) and then checking
# This improves the complexity to O(n/L) where n is word size and L is cache size

# Another cool way:
# XOR operation is the parity, we can exploit this by performing XOR multiple times each time taking half the bits (XOR is associative)
# O(1) for 64 bit input
def findParity(num):
    result = num
    result = result ^ (result >> 32)
    result = result ^ (result >> 16)
    result = result ^ (result >> 8)
    result = result ^ (result >> 4)
    result = result ^ (result >> 2)
    result = result ^ (result >> 1)
    return result & 1

num = int(input())
print(findParity(num))