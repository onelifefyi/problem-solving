# https://leetcode.com/problems/longest-substring-without-repeating-characters/

"""
3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
"""


# Approach:
# Simplest/Brute - try all possible substrings, then search each substring if duplicate or not
# Time O(n^3) | Space O(1)

# Better:
# Have two pointers, left, and right, keep expanding right till there are no duplicates
# If there's a duplicate, move left till there's no more duplicate
# Throughout the process, keep track of maxLength
# Time O(n) | Space O(n)
def lengthOfLongestSubstring(s):
    left, right = 0, 0
    maxLen = 0
    visited = set()
    
    while right < len(s):
        if s[right] not in visited:
            visited.add(s[right])
            maxLen = max(maxLen, right - left + 1)
            right += 1
        else:
            visited.remove(s[left])
            left += 1
            
    return maxLen


# s = "abcabcbb"
# s = "bbbbb"
# s = "pwwkew"
s = " "
print(lengthOfLongestSubstring(s))
