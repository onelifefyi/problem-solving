def isAlphaNumeric(c):
    return c in "0123456789abcdefghijklmnopqrstuvwxyz"


# Simplest approach: first clean the string, i.e, keep only alphanumeric. Then iterate from both ends
# O(n) time | O(n) space
# Need better solution
def isPalindrome(s):
    s = s.lower()
    cleaned_s = []
    for c in s:
        if isAlphaNumeric(c):
            cleaned_s.append(c)

    left = 0
    right = len(cleaned_s) - 1
    while(left < right):
        if cleaned_s[left] != cleaned_s[right]:
            return False
        left += 1
        right -= 1
    return True

s = input()
print(isPalindrome(s))