def minPairSum(nums):
    maxSum = 0
    nums.sort()
    i=0
    j=len(nums)-1
    while(i<j):
        maxSum = max(nums[i]+nums[j], maxSum)
        i += 1
        j -= 1
    return maxSum

print(minPairSum([int(num) for num in input().split()]))