# Normal Approach
# Time O(n)
# Space O(1)

# def parity(num):
# 	parity = 0
# 	while num:
# 		parity = parity ^ (num & 1)
# 		num = num >> 1
# 	return parity


# Removing last set bits | improvement
# We can remove the last set bit of X by performing this operation X = X & (X-1)
# This works because subtracting 1 from a number removes the last set bit, keeping everything else constant,
# and when we perform 'AND' opeation, It keeps everything else same, just removing the last set bit.
# Time O(n), worst case where all the bits are set to 1
# Space O(1)

# def parity(num):
# 	parity = 0
# 	while num:
# 		parity = parity ^ 1
# 		num = num & (num-1) # dropping the lowest set bit
# 	return parity


# This problem can be easily solved by levaraging the associative property of parity,
# Order doesn't matter, so we can cache the parities of smaller bits (say 16 bits) and for larger calculation
# example 64 bits, we can divide it into 4 sections -> 16 + 16 + 16 + 16 bits
# Get the parity from cache for each 16 bits and then simply get parity of result
# Time O(1)
# Space O(1)
# Note that this requires precomputation; creation of cache (say 'PRECOMPUTED_PARITY')

# def parity(num):
# 	parity = 0
# 	mask_size = 16
# 	mask = 0xFFFF
# 	while num:
# 		parity = parity ^ PRECOMPUTED_PARITY(num & mask)
# 		num = num >> mask_size


# There is even better way
# We can take help of the associative property of XOR
# So, each time we can take the first half of the bits and perform XOR with the remaining half
# Repeating the process till we reach the single bit

def parity(num):
	num = num ^ num >> 32
	num = num ^ num >> 16
	num = num ^ num >> 8
	num = num ^ num >> 4
	num = num ^ num >> 2
	num = num ^ num >> 1
	return num & 1

print(parity(1231235))