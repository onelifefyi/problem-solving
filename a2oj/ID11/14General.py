# https://codeforces.com/problemset/problem/144/A
# Time O(n) | space O(1)
n = int(input())
arr = input().split()

minVal = int(arr[-1])
minIndex = n-1

maxVal = int(arr[0])
maxIndex = 0

for i in range(0, n):
    if int(arr[i]) > maxVal:
        maxIndex = i
        maxVal = int(arr[i])
    if int(arr[i]) <= minVal:
        minIndex = i
        minVal = int(arr[i])

count = 0
if maxIndex > minIndex:
    count += maxIndex
    minIndex += 1    
    count += n - 1 - minIndex
else:
    count += maxIndex
    count += n -1 - minIndex

print(count)
