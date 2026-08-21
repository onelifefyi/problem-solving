# https://leetcode.com/problems/valid-parentheses/

# Approach:
# The only approach I can think of is using stack
# First, create a dict to store what corrosponding opening bracket looks like for each closing bracket
# Then, keep going through s, push in stack if it's opening bracket
# If closing bracket appears, pop one out, and see if it matches using dict

def isValid(s):
    opening = {")": "(",
               "}": "{",
               "]": "["
            }
    stack = []
    for ch in s:
        if ch in opening:
            if not stack: return False
            curr = stack.pop()
            if curr != opening.get(ch): return False
        else: stack.append(ch)
    return True if not stack else False 
    # realised better way to write this is "return not stack"
            

# s = "()[]{}"
s = "([)]"
print(isValid(s))
