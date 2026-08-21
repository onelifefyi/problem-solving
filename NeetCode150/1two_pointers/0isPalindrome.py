# https://leetcode.com/problems/valid-palindrome/

# Approach:
# Simplest approach is to rebuild the string removing all whitespaces and non alpha num chars, them compare with reverse
# Time O(n) | Space O(n)

# Better:
# Can have two pointers at each end, keep moving them and comparing till they are seperate
# Time O(n) | Space O(1)

def isPalindrome(s):
    left, right = 0, len(s)-1
    while left < right:
        if not s[left].isalnum(): 
            left += 1
            continue
        if not s[right].isalnum():
            right -= 1
            continue
        if s[left].lower() != s[right].lower(): return False
        left += 1
        right -= 1
    return True

# s = "A man, a plan, a canal: Panama"
s = "race a car"
print(isPalindrome(s))
