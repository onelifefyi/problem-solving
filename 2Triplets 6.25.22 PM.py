# Approach 1 Brute: O(N^3) ass possible pairs
# Approach 2: For each value perform pair sum (1st problem)
# Approach 3: Sort + for each value perform 2 pointer approach of pair sum (below)
            # O(NlogN) + O(N*N) == O(N^2)
def threeSum(nums, target):
    nums.sort()
    result = []
    for index, num in enumerate(nums[0:-3]):
        pair = [index+1, len(nums)-1]
        while(pair[0] < pair[1]):
            current_sum = num + nums[pair[0]] + nums[pair[1]]        
            if(current_sum > target):
                pair[1] -= 1
            elif(current_sum < target):
                pair[0] += 1
            else:
                result.append([num, nums[pair[0]], nums[pair[1]]])
                # I used break before, but that'll skip some pairs
                # break
                pair[0] += 1
                pair[1] -= 1
    return result


nums = [int(num) for num in input().split(' ')]
target = int(input())
print(threeSum(nums, target))