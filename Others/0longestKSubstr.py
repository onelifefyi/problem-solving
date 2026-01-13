# https://www.geeksforgeeks.org/find-the-longest-substring-with-k-unique-characters-in-a-given-string/

# Brute - check all possible substrings | O(n^2)
def longestKSubstr(s, k):
    maxLen = 0
    maxStr = ""
    n = len(s)
    for i in range(n):
        for j in range(i+1, n+1):
            uniqueChars = len(set(s[i:j]))
            if uniqueChars == k:
                length = j - i
                if length > maxLen:
                    maxLen = length
                    maxStr = s[i:j]
    return maxStr

# Optimal?

s = input()
k = int(input())
print(longestKSubstr(s, k))