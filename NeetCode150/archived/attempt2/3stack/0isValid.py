# https://leetcode.com/problems/valid-parentheses/

# Approach
# We can keep storing every opening bracket in a stack
# Whenever there's a closing bracket, pop and check if it's matching
# Time O(n) | Space O(n)
def isValid(s):
    valid_dict = {")": "(", "}": "{", "]": "["}
    open_stack = []
    for c in s:
        if c in valid_dict:
            if not open_stack: return False
            curr = open_stack.pop()
            if curr != valid_dict[c]: return False
        else: open_stack.append(c)
    return True if open_stack else False


s = "()[]{}"
print(isValid(s))