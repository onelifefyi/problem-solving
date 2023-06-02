def even_odd(nums):
    temp = 0
    left = 0
    right = len(nums) - 1
    while(left < right):
        if(nums[left] % 2 == 1):
            # print(nums[left])
            temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp
            right -= 1
        else:
            left += 1
    return nums

nums = [int(num) for num in input().split()]
print(even_odd(nums))