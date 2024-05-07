# https://leetcode.com/problems/longest-palindromic-substring/description/

# Brute: Check all possible substrings O(n^2) and then check if it's palindrome O(n) | Overall O(n^3)
# def isPalindrome(s):
#     return s == s[::-1]


# def longestPalindrome(s):
#     result = ""
#     resLen = 0
#     for i in range(len(s)):
#         for j in range(i+1, len(s)+1):
#             if isPalindrome(s[i:j]):
#                 length = j - i
#                 if length > resLen:
#                     resLen = length
#                     result = s[i:j]
#     return result


# If we change the way we find palindrome, it can be optimized | centre search approach
# To check if it's a palindrome, start from center and keep expanding till we find similar characters using two pointers.
# Iterating through each character (center) of the string O(n) | checking if it is palindrome (two pointer) O(n)
# Overall O(n^2)
def longestPalindrome(s):
    result = ""
    resLen = 0
    for i in range(len(s)):
        l, r = i, i

        # For odd length palindrome
        while l >= 0 and r < len(s) and s[l] == s[r]:
            length = r - l + 1
            if length > resLen:
                resLen = length
                result = s[l:r+1]
            l -= 1
            r += 1

        # For even length palindrome
        l, r = i, i+1
        while l >= 0 and r < len(s) and s[l] == s[r]:
            length = r - l + 1
            if length > resLen:
                resLen = length
                result = s[l:r+1]
            l -= 1
            r += 1

    return result


s = input()
print(longestPalindrome(s))