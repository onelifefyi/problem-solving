# https://leetcode.com/problems/encode-and-decode-strings/description/


# Approach:
# We can use the length of the string combined with a delimeter to keep track of length
# Time O(n) | Space O(1)
def encode(strs):
    result = ""
    delimiter = "#"
    for word in strs:
        result += str(len(word)) + delimiter + word
    return result


# Approach:
# Find the length of first word by getting the string till the delimiter is encountered to find the length
# Then add that many chars combined to form a word in the result, continue the process
# Time O(n) | Space O(m), where m is the number of words
def decode(s):
    result = []
    delimiter = "#"
    index = 0
    while index < len(s):
        length = ""
        while s[index] != delimiter:
            length += s[index]
            index += 1
        end = index + 1 + int(length)
        result.append(s[index + 1:end])
        index = end
    return result

strs = ["Test", "Rest", "OneLifeFyi", "5sdgsdh"]
encoded = encode(strs)
print(encoded)
print(decode(encoded))