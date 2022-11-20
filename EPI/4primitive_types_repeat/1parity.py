'''
# Approach1: Count the number of bits and then check if odd or even (Time O(#bits))
def find_parity(num):
	count = 0
	while num:
		count += num & 1
		num >>= 1
	return count % 2
'''

'''
# Approach2: Since it's like a switch, odd 1s = 1 and even 1s = 0, we can use xor (Time O(#bits))

def find_parity(num):
	result = 0
	while num:
		result = result ^ (num & 1)
		num >>= 1
	return result
'''

'''
# Approach3: One cool trick is to set the last 'set' bit to 0. Say for a number X, this will be achieved by performing X = X&(X-1)
# X-1, returns a number, with all the digits before the last set bit as 1 and the last set bit as 0
# Example: if X = (00101100)2 ,then X-1 = (00101011)2, Hence: X&(X-1) = (00101000)2 
# While the complexity is same for worst case (all bits are 1), it improves performance in best and average case
# Time O(k) where k is the number of set bits

def find_parity(num):
	result = 0
	while num:
		result ^= 1
		num = num&(num-1)
	return result
'''

'''
# Approach4: Parity computation if a very common operation, it would help if parity of set of all possible(small) bits is precomputed and cached somewhere. This will allow quick lookup while calculating parity.
# Now, suppose parity of all 16 bit numbers is precomputed and saved (in an array). If we want to find parity of 64 bit number, we can divide it in 4 16 bits part, compute parity of each and then xor the result.
# This 16 bits from 64 bits can be achieved by performing right shift and masking to 16 bits
# (masking is a way of performing AND operation, keeping only the desired bits as 1)
# Time O(#bits/precomputed_bit_size), Space O(precomputed_bit_max)

def find_parity(num):
	MASK_SIZE = 16
	BIT_MASK = 0xFFFF # 1111 1111 1111 1111
	return (PRECOMPUTED_PARITY[num>>(3*MASK_SIZE)] ^ ((PRECOMPUTED_PARITY[num >> (2*MASK_SIZE)) & BIT_MASK]) ^ (PRECOMPUTED_PARITY[(num>>MASK_SIZE) & BIT_MASK] ^ (PRECOMPUTED_PARITY[num & MASK_SIZE])
'''

# Approach 5: Since parity is equivalent to XOR of each bits in a number
# We can take all the bits and incremently perform XOR operations by taking half the bits and performing XOR with the remaining bits, performing this till only last bit remains
# Time O(log2(n)), Space O(1) where n is the number of bits

def find_parity(num):
	num ^= num>>32		
	num ^= num>>16
	num ^= num>>8
	num ^= num>>4
	num ^= num>>2
	num ^= num>>1
	return num & 1

num = int(input())
print(find_parity(num))
