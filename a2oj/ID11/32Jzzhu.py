# https://codeforces.com/problemset/problem/450/A

l = input().split()

n = int(l[0])
m = int(l[1])

arr = [int(num) for num in input().split()]

lastIndex = 0
count = 1

# Time O(m*n) | Aux Space O(1) // Accepted but not the most efficient

# while count > 0:
#     i = 0
#     count = 0
#     while i<n:
#         if arr[i] > 0:
#             count += 1
#             arr[i] -= m 
#             if arr[i] <= 0:
#                 lastIndex = i 
#         i += 1

# print(lastIndex + 1)


# Much more efficient below
# Time O(n) | Aux Space O(1)
import math

i = 0
maxVal = 0
maxIndex = 0

while(i < len(arr)):
    arr[i] = math.ceil(arr[i]/m)
    if arr[i] >= maxVal:
        maxVal = arr[i]
        maxIndex = i 
    i += 1

print(maxIndex+1)