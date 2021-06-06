n = int(input())
arr = [int(num) for num in input().split(' ')]
maxMatched = 0
left = 0
right = n-1
leftSum = 0
rightSum = 0
leftTurn = True

while(left<=right):
    while(leftSum<=rightSum and left<=right):
        leftSum += arr[left]
        left += 1
        if leftSum == rightSum:
            maxMatched = leftSum
    while(rightSum<=leftSum and left<=right):
        rightSum += arr[right]
        right -= 1
        if leftSum == rightSum:
            maxMatched = leftSum
    
print(maxMatched)

'''
5
1 3 1 1 4

L = 2
R = 2
LS = 4
RS = 5
maxMatched = 4
'''