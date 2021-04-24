# Merge two sorted array without extra space

# Two pointer approach
# Time O(n + m) | Aux space O(n + m) where n and m are length of arr1 and arr2 respectively
# def merge_sorted(arr1, arr2):
#     sorted = []
#     ptr1 = 0
#     ptr2 = 0
#     arr1_empty = False 
#     arr2_empty = False

#     while(arr1_empty == arr2_empty):
#         if(arr1[ptr1] <= arr2[ptr2]):
#             sorted.append(arr1[ptr1])
#             ptr1 += 1
#             if ptr1 == len(arr1):
#                 arr1_empty = True
#         else:
#             sorted.append(arr2[ptr2])
#             ptr2 += 1
#             if ptr2 == len(arr2):
#                 arr2_empty = True
        
#     sorted = sorted + arr2[ptr2:] if not arr2_empty else arr1[ptr1:]
#     return sorted


# Can we do without taking extra space
# This takes no additional space
# Time O(n*m) | Aux space O(1) where n and m is size of arr1 and arr2 respectively
def merge_sorted(arr1, arr2):
    ptr1 = 0

    while(True):
        if ptr1==len(arr1):
            break
        if(arr2[0] < arr1[ptr1]):
            tmp = arr1[ptr1]
            arr1[ptr1] = arr2[0]
            i = 1
            while(i<len(arr2) and arr2[i]<tmp):
                arr2[i-1] = arr2[i]
                i += 1
            arr2[i-1] = tmp
        ptr1 += 1
            
    return(arr1 + arr2)

arr1 = [int(num) for num in input().split()]
arr2 = [int(num) for num in input().split()]

arr_sorted = merge_sorted(arr1, arr2)
print(arr_sorted)