# https://leetcode.com/problems/permutation-in-string/

# Approach:
# Count the frequency of chars in s1 using list of size 26 (alphabets)
# Then create a window of same size (s1) and keep sliding the window right, till either list matches
# Or, right gets out of range
# Time O(n) | Space O(1)
def checkInclusion(s1, s2):
    if len(s2) < len(s1): return False
    s1_freq = [0] * 26
    for ch in s1:
        s1_freq[ord(ch) - ord('a')] += 1
    left, right = 0, len(s1) - 1
    s2_slice_freq = [0] * 26
    for i in range(len(s1)):
        s2_slice_freq[ord(s2[i]) - ord('a')] += 1
    while True:
        # The line below is O(1) because the list is of fixed size.
        if s1_freq == s2_slice_freq: return True
        right += 1
        if right >= len(s2): return False
        s2_slice_freq[ord(s2[left]) - ord('a')] -= 1
        left += 1
        s2_slice_freq[ord(s2[right]) - ord('a')] += 1



# s1 = "ab"
# s2 = "eidbaooo"
s1 = "ab"
s2 = "eidbhaooo"
print(checkInclusion(s1, s2))