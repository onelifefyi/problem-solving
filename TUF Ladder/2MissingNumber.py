# https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/

# Approach 1: create another array of same size and then keep adding elements from given array at it's value -1's index
# Run another pass, if count count == 0, it's missing
# Time O(n) | Aux space O(n)
# def getMissing(arr):
#     freq = [0]*len(arr)
#     for num in arr:
#         freq[num-1] += 1
#         # print(freq)

#     for index, val in enumerate(freq):
#         if(val == 0):
#             return index+1
        
# Approach 2: keep setting the value -ve at index
# Time O(n) | Aux space O(1)
def getMissing(arr):
    for num in arr:
        arr[abs(num)-1] *= -1 if arr[abs(num)-1] > 0 else 1
    for index, item in enumerate(arr):
        if item > 0:
            return index + 1

arr = [int(num) for num in input().split()]
print(getMissing(arr), "is the missing element")