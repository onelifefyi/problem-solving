# EPI page 43
            
# Approach1 | 
# find the expected sign of the result & store it
# now for each item in reversed arr2, multiply it with each element in 
# arr1 | keep the //10 in carry, add it to result[index1+index2+1] and store the %10 in result
# note that each iteration (i) of arr1 starts inserting from ith index of the result
# reverse the result
# remove the leading zeros
# return result
# Time O(m*n) | space O(m+n)

# def multiply(arr1, arr2):

#     result_sign = arr1[0]/abs(arr1[0]) * arr2[0]/abs(arr2[0])
#     # cool way to get sign:
#     # result_sign = -1 if (arr1[0]<0 ^ arr2[0]<0) else 1

#     # resetting the sign of first digit
#     arr1[0], arr2[0] = abs(arr1[0]), abs(arr2[0])

#     result = [0]*(len(arr1) + len(arr2))
#     for index2, val2 in enumerate(reversed(arr2)):
#         carry = 0
#         for index1, val1 in enumerate(reversed(arr1)):
#             toInsert = result[index1+index2] + (val1 * val2)
#             carry = toInsert//10
#             result[index1+index2] = toInsert%10
#             result[index1+index2+1] += carry
#     result = result[::-1]

#     # removing trailing zeros | (Note, need to fix this to stop when len == 1)
#     while result!=None and result[0] == 0:
#         result.pop(0)

#     result[0] = int(result[0]*result_sign)
#     return result


# Approach 2 | EPI
# Same concept, but better implementation.
# Instead of reversing the array and starting from index 0, directly start from end
def multiply(arr1, arr2):
    sign = -1 if (arr1[0] < 0) ^ (arr2[0] < 0) else 1
    arr1[0], arr2[0] = abs(arr1[0]), abs(arr2[0])

    result = [0] * (len(arr1) + len(arr2))

    for i in reversed(range(len(arr2))):
        for j in reversed(range(len(arr1))):
            # temp store
            result[i+j+1] += arr2[i] * arr1[j]
            # adding carry to previous digit
            result[i+j] += result[i+j+1] // 10
            # storing the %10 in result position
            result[i+j+1] %= 10
    
    # removing the leading zeros unless it's the last digit
    while result[0] == 0:
        if len(result) == 1:
            break
        result.pop(0)
    
    result[0] = int(sign * result[0])
    return result

arr1 = [-1, 2, 3]
arr2 = [6, 1]
print(multiply(arr1, arr2))