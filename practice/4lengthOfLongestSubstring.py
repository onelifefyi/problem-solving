# https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

# Brute - All substring, check length and if it repeats | using sets
# O(n^2 * n) -> O(n^3)

# Better - store the starting point of each character (latest)
# Each time the same character is encountered, remove everything from before it

def lengthOfLongestSubstring(s):
    start, maxLen = 0, 0
    lookup = {}
    for i, ch in enumerate(s):
        if ch in lookup and start <= lookup[ch]:
            start = lookup[ch] + 1
        else:
            maxLen = max(maxLen, i-start+1)
        lookup[ch] = i
    return maxLen



s = input()
print(lengthOfLongestSubstring(s))