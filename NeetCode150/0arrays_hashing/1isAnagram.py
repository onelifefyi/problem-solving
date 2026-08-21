# https://leetcode.com/problems/valid-anagram/

# Approach:
# Simplest approach I can think of is, first convert them to list of chars
# Them compare each char
# Time O(nlogn + n) = O(nlogn) | Space O(n)

# Better:
# create a list of size 26 filled with 0s, for each alphabet
# keep doing +1 for each alphabet in s
# keep doing -1 for each alphabet in t, if it goes to -1 or at the end is non zero,
# return False
# Time O(n) | Space O(1)

def isAnagram(s, t):
    freq = [0] * 26
    for ch in s:
        index = ord(ch) - ord('a')
        freq[index] += 1
    for ch in t:
        index = ord(ch) - ord('a')
        freq[index] -= 1
        if freq[index] < 0:
            return False
    for num in freq:
        if num != 0: return False
    return True

s = "anagraa"
t = "nagaram"
print(isAnagram(s, t))
