# Approach: Sort the array and return length of max consecutive
# Time O(NlogN + N) | Aux space O(1)
# def longestConsecutive(nums):
    # if len(nums) == 0:
    #     return 0
    # nums.sort()
    # maxConsecutive = 1
    # consecutive = 1
    # ptr = 0
    # while(ptr < len(nums)-1):
    #     if nums[ptr+1] == nums[ptr]:
    #         pass
    #     elif nums[ptr+1] == nums[ptr]+1:
    #         consecutive += 1
    #     else:
    #         consecutive = 1
    #     ptr += 1
    #     maxConsecutive = max(maxConsecutive, consecutive)
    # return maxConsecutive
            
# Approach: Put all the elements in a set and then check for each element,
#           If element is start of chain (n-1) doesn't exists, then check if n+1 is present on set,
#           Now count the length and return max chain length
# Time O(n) | Aux space O(n)
def longestConsecutive(nums):
    if len(nums) == 0:
        return 0
    numsSet = set()
    for num in nums:
        numsSet.add(num)

    maxConsecutive = 1
    for num in numsSet:
        consecutive = 1
        if num-1 not in numsSet:
            while(num+1 in numsSet):
                consecutive += 1
                num += 1
            maxConsecutive = max(maxConsecutive, consecutive)
            consecutive = 1
    return maxConsecutive

print(longestConsecutive([int(num) for num in input().split(' ')]))