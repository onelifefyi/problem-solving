# EPI page 37

# Reorder the input arrays that the even numbers come first
# Approach 1 | Simple, create other array, iterate through the first array
# on first pass inserting even numbers on the new array,
# and on second pass do the same for odd numbers
# Time O(n) | Space O(n)

# Now we want to optimize for space, can we do it without allocating extra space
# Approach | Keep iterating, keeping a pointer to the earliest position where 
# odd number is present, if new even number is encountered swap with odd, move the pointer
# ahead
# Time O(n) | Space O(1)
def even_odd(arr):
    odd_loc_ptr = 0
    for index, value in enumerate(arr):
        if value%2 == 0:
            arr[index] = arr[odd_loc_ptr]
            arr[odd_loc_ptr] = value
            odd_loc_ptr += 1
    return arr

arr = [int(num) for num in input().split()]
print(even_odd(arr))