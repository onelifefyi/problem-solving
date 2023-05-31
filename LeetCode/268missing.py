def missingNumber(nums):
    total_set = [num for num in range(len(nums) + 1)]
    total_set = total_set + nums
    result = 0
    for num in total_set:
        result ^= num
    return result

nums = [int(num) for num in input().split()]
print(missingNumber(nums))