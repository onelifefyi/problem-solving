# https://leetcode.com/problems/trapping-rain-water/

def trap(height):
    leftMaxHeight = [0]*len(height)
    maxL = height[0]
    for index in range(len(height)):
        maxL = max(maxL, height[index])
        leftMaxHeight[index] = maxL
    
    rightMaxHeight = [0]*len(height)
    maxR = height[-1]
    for index in range(len(height)-1, -1, -1):
        maxR = max(maxR, height[index])
        rightMaxHeight[index] = maxR
    
    # print(leftMaxHeight)
    # print(rightMaxHeight)
    total = 0
    for index, value in enumerate(height):
        total += min(rightMaxHeight[index], leftMaxHeight[index]) - value

    return total

print(trap([0,1,0,2,1,0,1,3,2,1,2,1]))
print(trap([4,2,0,3,2,5]))

'''
[0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
[0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3]
[3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1]
[0, 0, 1, 0, 1, 2, 1, 0, 0, 1, 0, 0]
'''