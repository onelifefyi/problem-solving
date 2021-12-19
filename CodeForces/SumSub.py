css = int(input())
for _ in range(css):
    nums = input().split()
    print(nums[0], nums[1], int(nums[-1]) - int(nums[0]) - int(nums[1]))