# https://leetcode.com/problems/encode-and-decode-strings/

# Approach:
# Have to keep track of number of chars in each word, and encode it somehow in the string
# Can add the length + delimiter as prefix to word before joining
# This will allow me to parse the exact length while decoding

# Time O(n) | Space O(1)
def encode(self, strs: List[str]) -> str:
    res = ""
    for word in strs: res += str(len(word)) + "#" + word
    return res

# Time O(c), where c is the num of characters | Space O(n), where n is the number of words
def decode(self, s: str) -> List[str]:
    res = []
    i = 0

    while i < len(s):
        j = i
        while s[j] != "#": j+=1
        length = int(s[i:j])
        res.append(s[j + 1: j + 1 + length])
        i = j + 1 + length
    return res