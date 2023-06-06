    def isPalindrome(x):
        num = str(x)
        return num == num[::-1]

x = int(input())
print(isPalindrome(x))