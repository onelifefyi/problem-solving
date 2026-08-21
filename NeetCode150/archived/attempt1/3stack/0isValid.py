# https://leetcode.com/problems/valid-parentheses/

# Approach:
# Create a stack
# Keep pushing all the opening brackets
# If closing bracket comes up, pop from stack, see if correct opening
# If incorrect, return False
# If stack runs out of opening or stack not empty by end, return False
# return True otherwise
# Time O(n) | Space O(n)

def isValid(s):
    valid_brackets = {
        "}": "{",
        "]": "[",
        ")": "("
    }
    stack = []
    for bracket in s:
        if bracket not in valid_brackets:
            stack.append(bracket)
        else:
            if not stack: return False
            opening_bracket = stack.pop()
            if valid_brackets[bracket] != opening_bracket: return False
    return not stack

# s = "()[]{}"
s = "(]"
s = "(((("
print(isValid(s))
 