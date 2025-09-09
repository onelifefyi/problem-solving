# Simple approach
# Time O(num_digits)

def isPalindrome(num):
    if num < 0:
        return False
    reverse = 0
    temp = num
    while temp:
        reverse = reverse * 10
        reverse += temp%10
        temp = temp//10
    
    return reverse == num

# Better approach -> we can get num of digits by getting log10(num) + 1
# Then iteratively comparing first and last digit, exiting if there is a mismatch

print(isPalindrome(-121))
print(isPalindrome(121))
print(isPalindrome(2))
print(isPalindrome(1531))