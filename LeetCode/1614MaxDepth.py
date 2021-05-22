# https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

# Time O(n) | Aux space O(1)
def maxDepth(s):
    maxleft = 0
    left = 0
    for ch in s:
        if ch=='(':
            left += 1
            maxleft = max(left, maxleft)
        elif ch==')':
            left -= 1
    return maxleft

print(maxDepth("(1+(2*3)+((8)/4))+1"))