# EPI page 43

# Approach: Check the last element of the array, if it's less than 9 (no carry)
# Then simply increment and return the array
# Otherwise, make that position as 0 and then move to the previous digit, 
# checking the same condition.
# If you reach 0 and still the result isn't returned, insert 1 at the first position
# and return (Insertion at 0th position is very expensive, so better append)
# Since we know that if one more digit is added by adding one, the last digit will be 0
# So, simply append 0 and make the first digit 1
# Time O(n) | Space O(1)

# def plus_one(arr):
#     ptr = len(arr) - 1
#     while ptr >= 0:
#         if arr[ptr] < 9:
#             arr[ptr] += 1
#             return arr
#         else:
#             arr[ptr] = 0
#             ptr -= 1

#     # if result not returned yet, means there is increment in number of digits
#     arr.append(0)
#     arr[0] = 1
#     return arr

# Same complexity | EPI implementation:
def plus_one(arr):
    arr[-1] += 1
    for ptr in reversed(range(1, len(arr))):
        if arr[ptr] != 10:
            break
        arr[ptr] = 0
        arr[ptr-1] += 1
    if arr[0] == 10:
        arr.append(0)
        arr[0] = 1
    return arr

arr = [int(num) for num in input().split()]
print(plus_one(arr))