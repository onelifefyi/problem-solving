# EPI page 39

# Dutch national flag problem
# We are given an array, having 3 elements 0s, 1s and 2s.
# We need to partition the given array to keep the like elements together

# The simplest(brute) approach is to sort the array
# Time O(nlogn) | space O(1)

# Another approach is to iterate one pass, counting number of 0s, 1s and 2s
# After that fill the array with the same number of elements on second pass
# Time O(n) | Space O(1) 

# Another approach, one pass, take 1 pointer at the start, for 0s. another pointer at the end, for 2s
# and another pointer that will iterate through the list.
# When iterator pointer sees 0, we swap it with element at start pointer.
# If it approaches 2, swap it with element at end pointer
# If it's 1, just move the iterator ahead
# Time O(n) | space O(1)

def sort_array(arr):
    zero_ptr = 0
    two_ptr = len(arr) - 1
    iterator = 0
    while iterator <= two_ptr:
        if arr[iterator] == 0:
            arr[iterator] = arr[zero_ptr]
            arr[zero_ptr] = 0
            zero_ptr += 1
        elif arr[iterator] == 2:
            arr[iterator] = arr[two_ptr]
            arr[two_ptr] = 2
            two_ptr -= 1
        else:
            iterator += 1
    return arr

nums = [int(num) for num in input().split()]
print(sort_array(nums))