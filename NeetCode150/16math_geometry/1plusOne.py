# https://leetcode.com/problems/plus-one/description/

# Approach:
# I guess, I'll just have one more variable for carry
# Time O(n) | Space O(1) ... this is a bit confusing, worst case if I append one, is that still O(n), idk

def plusOne(digits):
    carry = 1
    index = len(digits) - 1
    while carry and index >= 0:
        if digits[index] == 9: digits[index] = 0
        else: 
            digits[index] += 1
            carry = 0
        index -= 1
    if carry: digits = [1] + digits
    return digits


digits = [4, 3, 2, 1]
digits = [9, 9, 9, 9]
print(plusOne(digits))
