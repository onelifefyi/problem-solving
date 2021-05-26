# https://codeforwin.org/2015/06/c-program-to-check-whether-number-is-palindrome-or-not.html

# Time O(log10(num))
def isPali(num):
    rev = 0
    temp = num
    while(temp>0):
        rev *= 10
        rev += temp%10
        temp = temp//10 

    return True if num==rev else False

print(isPali(int(input())))