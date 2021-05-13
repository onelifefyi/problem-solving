# https://leetcode.com/problems/shuffle-string/

# Time O(n) | Space O(n)
def restoreString(s, indices):
    result = [''] * len(s)
    for i in range(0, len(s)):
        result[indices[i]] = s[i]

    return ''.join(result)

s = input()
indices = [int(num) for num in input().split()]
print(restoreString(s, indices))