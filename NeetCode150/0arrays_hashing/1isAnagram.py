# https://leetcode.com/problems/valid-anagram/

# Approach:
# Simplest approach I can think of is, first convert them to list of chars
# Them compare each char
# Time O(nlogn + n) = O(nlogn) | Space O(n)

# Better:
# create a list of size 26 filled with 0s, for each alphabet
# keep doing +1 for each alphabet in s
# keep doing -1 for each alphabet in t
# if freq contains non zero element at the end, return False
# Time O(n) | Space O(1)

def isAnagram(s, t):
    freq = [0] * 26
    if len(s) != len(t): return False
    for i in range(len(s)):
        freq[ord(s[i]) - ord('a')] += 1
        freq[ord(t[i]) - ord('a')] -= 1
    for num in freq:
        if num != 0: return False
    return True

s = "anagraa"
t = "nagaram"
print(isAnagram(s, t))
