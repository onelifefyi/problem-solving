# NOT CORRECT (Doesn't return min in all cases)

# def minimumXORSum(nums1, nums2):
#     for num in nums1:
#         if num in nums2:
#             nums1.pop(nums1.index(num))
#             nums2.pop(nums2.index(num))
#     nums1.sort()
#     nums2.sort()
#     print(nums1)
#     print(nums2)
#     sum = 0
#     for index, _ in enumerate(nums1):
#         sum += nums1[index] ^ nums2[index]
#     return sum

# NOT CORRECT (Doesn't return min in all cases)
import sys
def minimumXORSum(nums1, nums2):
    for num in nums1:
        if num in nums2:
            nums1.pop(nums1.index(num))
            nums2.pop(nums2.index(num))
    nums1.sort()
    nums2.sort()
    sum = 0
    
    i = len(nums1)-1
    while(i>=0):
        minIndex = -1
        minXOR = sys.maxsize
        for index, value in enumerate(nums2):
            if(nums1[i]^value <= minXOR):
                minIndex = index
                minXOR = nums1[i]^value
        nums2.pop(minIndex)
        sum += minXOR
        i -= 1
    return sum

l1 = [int(num) for num in input().split()]
l2 = [int(num) for num in input().split()]
print(minimumXORSum(l1, l2))