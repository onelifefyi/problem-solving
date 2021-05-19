# https://leetcode.com/problems/split-a-string-in-balanced-strings/
# Wrong question, solved advanced ones below

# Taking all substring
# Time O(n^2) | IDK what it takes for count | space O(1)
# def balancedStringSplit(s):
#     count = 0
#     for i in range(0, len(s)):
#         for j in range(i+1, len(s)):
#             if(s[i:j+1].count('L') == s[i:j+1].count('R')):
#                 count += 1
#    return count

# Efficient
# Time O(n^2) | space O(1)
def balancedStringSplit(s):
    result = 0
    for i in range(0, len(s)):
        count = 0
        for ch in s[i+1:len(s)+1]:
            count += 1 if ch == 'L' else -1
            if count == 0:
                result += 1
    return result

print(balancedStringSplit("RLRRLLRLRL"))