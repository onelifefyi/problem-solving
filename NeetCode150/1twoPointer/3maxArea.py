# https://leetcode.com/problems/container-with-most-water/description/

# Approach
# SSimplest/Brute - Try all possible combination
# Time O(n^2) | Space O(1)

# Better:
# Two pointer approach, one at leftmost and the other at rightmost
# Keep track of maxLeft and maxRight, moving whatever is smaller
# Finally return min(maxLeft, maxRight) * distance
# Time O(n) | Space O(1)

# While this isn't mathematically wrong, it's solving the wrong problem
# It's keeping track of maxLeft and maxRight, which isn't required
# We strictly want to check for current left and current right, not max so far

# def maxArea(height):
#     maxLeft, maxRight = -1, -1
#     maxArea = 0
#     left, right = 0, len(height) - 1
#     while left <= right:
#         if height[left] > maxLeft: maxLeft = height[left]
#         if height[right] > maxRight: maxRight = height[right]
#         maxArea = max(maxArea, min(maxLeft, maxRight) * (right - left))
#         if height[left] < height[right]: left += 1
#         else: right -= 1
#     return maxArea


# Correct:
# two pointers, left and right
# whichever is smaller, move that pointer, each time keeping track of max area so far
# Time O(n) | Space O(1)
def maxArea(height):
    left, right = 0, len(height) - 1
    maxArea = 0
    while left < right:
        maxArea = max(maxArea, min(height[left], height[right]) * (right - left))
        if height[left] < height[right]: left += 1
        else: right -= 1
    return maxArea


height = [1,8,6,2,5,4,8,3,7]
print(maxArea(height))