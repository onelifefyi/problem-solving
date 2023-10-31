# Time O(log10(num)), b'cos log10(num) gives the number of digits
# Space O(1)
def count_bits(num):
	count = 0
	while num:
		count += num & 1
		num = num >> 1
	return count

num = int(input())
print(count_bits(num))
