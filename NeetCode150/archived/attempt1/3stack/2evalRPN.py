# https://leetcode.com/problems/evaluate-reverse-polish-notation/

# Approach:
# Every non-operator, push to result
# When operator found, pop twice from result and store it back in the result
# Finally, return the remaining element.

# Time O(n) | Space O(n)
def evalRPN(tokens):
    def operate(operator, num1, num2):
        if operator == "+": return int(num1) + int(num2)
        elif operator == "-": return int(num1) - int(num2)
        elif operator == "/": return int(num1) / int(num2)
        else: return int(num1) * int(num2)
    ptr = 0
    result = []
    while ptr < len(tokens):
        if tokens[ptr] in ["*", "/", "+", "-"]:
            num2 = result.pop()
            num1 = result.pop()
            result.append(operate(tokens[ptr], num1, num2))
        else:
            result.append(tokens[ptr])
        ptr += 1
    return int(result[0])

# tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
# tokens = ["4","13","5","/","+"]
tokens = ["2","1","+","3","*"]
print(evalRPN(tokens))