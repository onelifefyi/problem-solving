# https://codeforwin.org/2015/08/c-program-to-convert-from-decimal-to-binary-number-system.html

import math
def getBin(num):
    start = math.floor(math.log2(num))
    result = ""
    while(num != 0):
        if 2**start <= num:
            num -= 2**start
            result += '1'
        else:
            result += '0'
        start -= 1
    print(result)

getBin(int(input()))