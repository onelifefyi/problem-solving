# https://leetcode.com/problems/container-with-most-water/description/

# Approach:
# All possible combination
# Time O(n^2) | Space O(1)

# Approach:
# Keep track of 3 things, left, right and maxVol
# keep moving the smaller boundry pointer
# return max
# Time O(n) | Space O(1)
def maxArea(height):
    maxVol = 0
    left, right = 0, len(height)-1
    while left < right:
        vol = min(height[left], height[right]) * (right - left)
        maxVol = max(maxVol, vol)
        if height[left] < height[right]: left += 1
        else: right -= 1
    return maxVol

# height = [1,8,6,2,5,4,8,3,7]
height = [1,1]
print(maxArea(height))
