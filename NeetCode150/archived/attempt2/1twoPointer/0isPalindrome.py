# https://leetcode.com/problems/valid-palindrome/


# Approach:
# Can create another string, starting from the end and compare both
# Time O(n) | Space O(n)

# Two pointer approach: have left and right pointer, then keep moving if
# valid character is not found, compare if valid character
# if different, return False, at the end (left >= right) return True
# Time O(n) | Space O(1)
def isPalindrome(s):
    left, right = 0, len(s) - 1
    while left < right:
        if not s[left].isalnum():
            left += 1
            continue
        if not s[right].isalnum():
            right -= 1
            continue
        if s[left].lower() != s[right].lower():
            return False
        left += 1
        right -= 1
    return True

# s = "A man, a plan, a canal: Panama"
s = "0P"
print(isPalindrome(s))