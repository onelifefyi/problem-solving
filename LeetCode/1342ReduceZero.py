# https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

# Time O(#digits of n) | aux space O(n)
def numberOfSteps(n):
    binaryRep = bin(n)[2:]
    return binaryRep.count('1') + len(binaryRep) - 1

# Time O(log(n)) | space O(1)
# def numberOfSteps(self, num: int) -> int:
#     count = 0
#     while num>0:
#         if num%2 == 1:
#             num -= 1
#         else:
#             num = num/2
#         count += 1
        
#     return count

print(numberOfSteps(int(input())))