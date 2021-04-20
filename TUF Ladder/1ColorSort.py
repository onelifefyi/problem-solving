# Sort an array of 0’s 1’s 2’s without using extra space or sorting algo

# Time O(n) | Aux Space O(1)
# For the case of one pass
# Using Dutch Flag Problem approach (See this again)
def colorSort(arr):
    left = 0
    right = len(arr)-1
    n = 0

    while(n<=right):
        # print(f"n: {n}; left: {left}; Right: {right}")
        # print(arr)
        if(arr[n] == 0):
            arr[n] = arr[left]
            arr[left] = 0
            left += 1
            n += 1
        elif(arr[n] == 2):
            arr[n] = arr[right]
            arr[right] = 2
            right -= 1
        else:
            n += 1
    return arr

# If we can take extra variables, we use 3 variable/counter for each of 0, 1 and 2 and count frequency
# This takes 2 pass
# Time O(n) | Aux Space O(1)

arr = [int(num) for num in input().split()]
print(colorSort(arr))