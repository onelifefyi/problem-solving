# https://leetcode.com/problems/longest-palindromic-substring/description/

# Approach:
# Same as the last one, simply count the num of palindrome
def countSubstrings(s):
    total = 0
    for i in range(len(s)):
        # check odd palindrome
        l, r = i, i
        while l >= 0 and r < len(s) and s[l] == s[r]:
            total += 1
            l -= 1
            r += 1

        # check even palindrome
        l, r = i, i+1
        while l >= 0 and r < len(s) and s[l] == s[r]:      
            total += 1
            l -= 1
            r += 1
    return total

s = "aaa"
s = "abc"
print(countSubstrings(s))
