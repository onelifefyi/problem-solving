# https://leetcode.com/problems/plus-one/

# Approach:
# Follow the same approach that's used for integer addition
# We just need to add 1, start from right most, keep updating
# Time O(n) | Space O(1)
def plusOne(digits):
    index = len(digits) - 1
    carry = 1
    carry = True
    for i in range(len(digits)-1, -1, -1):
        if digits[i] == 9:
            digits[i] = 0
        else:
            digits[i] += 1
            carry = False
            break
    if carry: 
        digits[0] = 1
        digits.append(0)
    return digits

digits = [4,3,2,1]
# digits = [1,2,3]
# digits = [9]
print(plusOne(digits))