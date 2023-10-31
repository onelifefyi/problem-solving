# EPI page 33

# Approach | Simple in python, take it as string and check by reversing
# Approach | Calculate the reverse of the number & check if it's equal or not

# Approach | Similar to above approach, but if we can't declare another variable,
# then we can iteratively extract the least and most significant digit and comparing them
# For this, we will need to find out how many digit the number(X) is, this can be
# calculated by floor(log(b10)X) + 1

import math
def is_palindrome(num):
    if num<0:
        return False
    num_digits = math.floor(math.log(num, 10)) + 1
    n = 1
    while num:
        last_digit = num%10
        first_digit = num // 10**(num_digits-n)
        # print(num, first_digit, last_digit)
        if last_digit != first_digit:
            return False
        num = num % 10**(num_digits-n)
        num = num // 10
        n += 2
    return True

num = int(input())
print(is_palindrome(num))