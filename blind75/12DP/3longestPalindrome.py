# https://leetcode.com/problems/longest-palindromic-substring/description/

# Approach:
# Instead of checking all possible strings
# Check using middle out, for each char as mid point (or char & char at index +1 if even)
# Time O(n^2) | Space O(1)
def longestPalindrome(s):
    maxStr = ""
    for i in range(len(s)):
        # check odd palindrome
        l, r = i, i
        while l >= 0 and r < len(s) and s[l] == s[r]:
            maxStr = maxStr if len(maxStr) > r-l+1 else s[l:r+1]
            l -= 1
            r += 1

        # check even palindrome
        l, r = i, i+1
        while l >= 0 and r < len(s) and s[l] == s[r]:      
            maxStr = maxStr if len(maxStr) > r-l+1 else s[l:r+1]
            l -= 1
            r += 1
    return maxStr

s = "babad"
print(longestPalindrome(s))

s = "cbbd"
print(longestPalindrome(s))
