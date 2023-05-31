def singleNumber(nums):
	result = 0
	for num in nums:
		result ^= num
	return result

nums = [int(num) for num in input().split()]
print(singleNumber(nums))
