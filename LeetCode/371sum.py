# Incomplete


# How do we perform addition in at bit level
def getSum(a, b):
    carry = 0
    bit = 0
    while a and b:
        if (a&1) | (b&1):
            pass
        else:
            if carry:
                bit = 1
            else:
                bit = 0
            carry = 0
                




a = int(input())
b = int(input())
print(getSum(a, b))