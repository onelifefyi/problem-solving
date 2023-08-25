# Time O(n)
# Space O(1)

def count_bits(num):
	count = 0
	while num:
		count += num & 1
		num = num >> 1
	return count

print(count_bits(10))
