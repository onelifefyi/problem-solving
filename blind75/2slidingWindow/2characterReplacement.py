# https://leetcode.com/problems/longest-repeating-character-replacement/

# Approach:
# Use hashmap to keep track of freq of each character
# Keep track of max frequency that we will use to determine allowed window
# When window exceeds the limit, move the left pointer

# Time O(n) | Space O(m) where m is the # unique characters
def characterReplacement(s, k):
    freq = {}
    max_freq = 0
    left, right = 0, 0
    res = 0
    while right < len(s):
        freq[s[right]] = freq.get(s[right], 0) + 1
        max_freq = max(max_freq, freq[s[right]])
        if right - left + 1 - max_freq > k:
            freq[s[left]] -= 1
            left += 1
        res = max(res, right - left + 1)
        right += 1
    return res

# s = "ABAB"
# k = 2

s = "AABABBA"
k = 1

print(characterReplacement(s, k))