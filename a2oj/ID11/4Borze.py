# https://codeforces.com/problemset/problem/32/B
# Time O(1) | Aux space O(1)

code = [char for char in input()]

result = ''
i = 0
while (i<len(code)):
    if code[i] == '.':
        result += '0'
        i += 1
    elif code[i+1] == '.':
        result += '1'
        i += 2
    else:
        result += '2'
        i += 2

print(result)