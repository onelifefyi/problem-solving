# https://leetcode.com/problems/valid-anagram/

# Approach:
# Add all the chars to list (for each string)
# Sort both the list
# Compare the list
# Time O(nlogn + mlogm) | Space O(n + m)

# Approach:
# Create a single array which is of size 26
# For each character of s, keep count of frequency of each character
# For each char of t, keep substracting the corrosponding frequency from the array
# Finally, check if there's any non-zero number in the array, if so return False, otherwise return True
# Time O(n + m) | Space O(1)

def isAnagram(s, t):
    freq_array = [0] * 26
    for ch in s:
        freq_array[ord(ch) - ord('a')] += 1
    for ch in t:
        freq_array[ord(ch) - ord('a')] -= 1
    for freq in freq_array:
        if freq != 0: return False
    return True

# s = "anagram"
# t = "nagaram"
s = "rat"
t = "car"
print(isAnagram(s, t))