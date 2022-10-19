# EPI page 45



# If we had the option to use additional space, then we can push all the elements
# in the set or create another array and publish unique values, and return the result
# Time O(n) | Space O(n)

# If we must not use additional space:

# Brute, iterate throug the entire array, every time see a repeated entry
# i.e, arr[i] == arr[i-1], delete that entry and shift the remaining array
# return the length of the array
# Time O(n^2) | Space O(1)

# Better approach: We can use two pointers
# Time O(n) | Space O(1)
def delete_duplicate(arr):
    dup_ptr, ptr = 0, 0

    while ptr<len(arr):
        if arr[ptr] != arr[dup_ptr]:
            dup_ptr += 1
            arr[dup_ptr] = arr[ptr]
        ptr += 1
    return dup_ptr+1


arr = [int(num) for num in input().split()]
print(delete_duplicate(arr))