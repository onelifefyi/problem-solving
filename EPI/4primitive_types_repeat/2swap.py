# We've to swap the bit between ith and jth position
# When do we swap? Only if both the bits are different
# A way to swap is by perform XOR '^' operation of that bit with '1'
# So, 1^1 = 0 & 0^1 = 1; Hence bits get swapped if XORed by 1
# Approach1, find the 'i'th and 'j'th bit, if different, then XOR by 1, else keep as it is
# We find the ith bit by performing OR operation of that number and 2^i and similarly for jth bit
# another cool way to do it is by first ORing 1<<i and 1<<j and then performing XOR with num 
def swap_bits(num, i, j):
		# Checking if both the numbers are different
		if num>>i & 1 != num>>j & 1:
			# creating mask containing both the swap positions
			bit_mask = 1<<i | 1<<j
			# XORing to get the swapped result
			num ^= bit_mask
		return num


num, i, j = [int(num) for num in input().split()]
print(swap_bits(num, i, j))
