# https://leetcode.com/problems/xor-operation-in-an-array/

# Time O(n) | Aux space O(1)
def xorOperation(n, start):
    result = 0
    for num in range(start, start + 2*n, 2):
        result ^= num
        
    return result

n, start = [int(n) for n in input().split()]
print(xorOperation(n, start))