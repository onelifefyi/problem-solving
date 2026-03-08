# https://leetcode.com/problems/3sum/

# Approach:
# Simplest approach - check for all possible combination
# Time O(n^3) | Space O(1)

# Approach:
# Sort the array
# For each number, perform two sum on the rest of the array
# Keeping target as num * -1
# Time O(nlogn + n^2) = O(n^2) | Space O(n)
def threeSum(nums):
    nums.sort()
    index = -1
    result = set()
    while index < len(nums) - 3:
        index += 1
        target = -1 * nums[index]
        left = index + 1
        right = len(nums) - 1
        while left < right:
            addition = nums[left] + nums[right]
            if addition == target:
                result.add((target*-1, nums[left], nums[right]))
                left += 1
                right -= 1
            elif addition < target: left += 1
            else: right -= 1
            
    return [list(triplet) for triplet in result]


# nums = [-1,0,1,2,-1,-4]
# nums = [0, 1, 1]
# nums = [0,0,0]
nums = [2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10]
print(threeSum(nums))