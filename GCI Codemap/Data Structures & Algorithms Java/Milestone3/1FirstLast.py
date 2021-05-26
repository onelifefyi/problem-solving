# https://codeforwin.org/2015/06/how-to-find-first-and-last-digit-of-any-number.html

# Using loop
# Time O(n) | Aux space O(1) where n is number of digits
# def findFirstLast(num):
#     last = num%10
#     while(num >= 10):
#         num = num//10

#     print("First Digit:",num)
#     print(f"Last Digit: {last}")

# Without loop
# Concept: We can use log(base10) to find the number of digits of decimal number
# Time O(1) | Aux space O(1)
import math
def findFirstLast(num):
    last = num%10
    digits = math.floor(math.log10(num)) + 1
    first = num//10**(digits-1)

    print(f"First: {first}\nLast: {last}")

findFirstLast(int(input()))