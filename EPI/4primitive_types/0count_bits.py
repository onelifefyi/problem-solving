# EPI page 23

# Program to find the number of binary '1' in a number
# Time O(n) where n is the number of bits needed to represent num
# Space O(1)

def count_bits(num):
	num_bits = 0
	# while loop till num becomes zero by iteratively shifting it right
	while num:
		# returns the result of AND operation between num and binary '1'
		if num & 1 == 1:
			# increase count only if the 'AND' operation return 1
			num_bits += 1
		# shifting the num by 1 after every iteration
		num = num >> 1
	return num_bits

num = int(input())
print(count_bits(num))