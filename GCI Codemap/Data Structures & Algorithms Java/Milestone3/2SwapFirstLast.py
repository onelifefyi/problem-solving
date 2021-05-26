# https://codeforwin.org/2016/01/c-program-to-swap-first-and-last-digit-of-number.html

# Time O(1) | Aux space O(1) where n is number of digits
import math
def findFirstLast(num):
    last = num%10
    digits = math.floor(math.log10(num)) + 1
    first = num//10**(digits-1)

    print((num-last+first)- (first*(10**(digits-1))) + (last*(10**(digits-1))))

findFirstLast(int(input()))