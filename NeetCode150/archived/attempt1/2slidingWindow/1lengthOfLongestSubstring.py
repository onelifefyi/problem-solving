# https://leetcode.com/problems/longest-substring-without-repeating-characters/

# Approach:
# Use a hashmap to keep track of all the visited characters and their index.
# If the same character appears, keep removing till that index (value).
# Keep track of max len of dict all the time.

# Time O(n) | Space O(n)
def lengthOfLongestSubstring(s):
    visited = {}
    left = 0
    right = 0
    max_len = 0
    while right < len(s):
        if s[right] in visited:
            old_position = visited[s[right]]
            while left <= old_position:
                to_remove = s[left]
                visited.pop(to_remove)
                left += 1
        visited[s[right]] = right
        right += 1
        max_len = max(max_len, len(visited))
    return max_len
    


# s = "abcabcbb"
# s = "bbbbbb"
# s = "pwwkew"
s = "    2"
print(lengthOfLongestSubstring(s))