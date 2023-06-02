# pass 1
# if pivot, sjip
# if lesser, skip
# if greater , swap
def dutch_flag_partition(pivot_index, nums):
    left, equal, right = (0, 0, len(nums)-1)
    pivot = nums[pivot_index]
    while equal <= right:
        if nums[equal] < pivot:
            nums[left], nums[equal] = nums[equal], nums[left]
            left += 1
            equal += 1
        elif nums[equal] > pivot:
            nums[right], nums[equal] = nums[equal], nums[right]
            right -= 1
        elif nums[equal] == pivot:
            equal += 1
    return nums

pivot_index = int(input())
nums = [int(num) for num in input().split()]
print(dutch_flag_partition(pivot_index, nums))