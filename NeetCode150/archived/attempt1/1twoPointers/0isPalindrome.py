# https://leetcode.com/problems/valid-palindrome/description/

# Approach:
# Step 1: clean the string (remove non-alphanumeruic and spaces and lower case the str)
# Step 2: compare the reversed string
# Time O(n) | Space O(1)


# Approach:
# Similar, but more efficient
# Have two pointers at each end
# Keep comparing if alphanumeric, skip if not alphanumeric
# Time O(n) | Space O(1)
def isPalindrome(s):
    left = 0
    right = len(s) - 1
    while left <= right:
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

# s = "race a car"
# s = "A man, a plan, a canal: Panama"
s = " "
print(isPalindrome(s))