# https://leetcode.com/problems/goal-parser-interpretation/

# Time O(n) | Aux space O(n) where n is length of input string command
def interpret(command):
    index = 0
    result = ""
    while index < len(command):
        if command[index] == 'G':
            result += 'G'
            index += 1
        elif command[index+1] == ')':
            result += 'o'
            index += 2
        else:
            result += "al"
            index += 4
            
    return result

command = input()
print(interpret(command))