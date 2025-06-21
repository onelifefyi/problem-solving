# https://leetcode.com/problems/sum-of-two-integers/description/

# Approach:
# Manual bin addition... works for addition only
# def getSum(a, b):
#    a, b = max(a, b), min(b, a)
#    carry = 0
#    curr = 0
#    res = 0
#    bit = 0
#    while a:
#        curr_a = a & 1
#        a = a >> 1
#        curr_b = b & 1
#        b = b >> 1
#
#        if curr_a != curr_b:
#            curr = 0 if carry else 1
#        elif curr_a == 0:
#            curr = 1 if carry else 0
#            carry = 0
#        else:
#            curr = 1 if carry else 0
#            carry = 1
#        curr = curr << bit
#        res = res | curr
#        bit += 1
#    if carry:
#        carry = carry << bit
#        res = res | carry
#    return res

# This won't work either because of the way -ve numbers are handled in python
# The equivalent java code should work
def getSum(a, b):
    # taking b as carry
    while b:
        tmp = (a & b) << 1
        a = a ^ b
        b = tmp
    return a

a = 3
b = 3
print(getSum(a, b))
