# https://leetcode.com/problems/valid-anagram/

# Approach: create a frequency table of all english characters (26)
# Insert all the characters count of the first string
# remove all the characters count of second string.
# IF the frequency table is 0 then anagram else not anagram

# Time: inserting O(n) + deleting O(n) + checking O(n)
# O(n)
def isAnagram(s, t):
    freqList = [0] * 26
    s = s.lower()
    t = t.lower()
    for ch in s:
        freqList[ord(ch) - ord('a')] += 1
    for ch in t:
        freqList[ord(ch) - ord('a')] -= 1
    for num in freqList:
        if num != 0:
            return False
    return True

s = input()
t = input()
print(isAnagram(s, t))