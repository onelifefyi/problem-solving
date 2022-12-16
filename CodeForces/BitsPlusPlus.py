nos = int(input())
result = 0

for _ in range(nos):
    expression = input()
    if "++" in expression:
        result += 1
    elif "--" in expression:
        result -= 1

print(result)