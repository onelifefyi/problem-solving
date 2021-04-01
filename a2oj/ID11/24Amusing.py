# https://codeforces.com/problemset/problem/141/A
# Time O(n) | Aux Space O(1)

allChar = [0 for _ in range(26)]

for char in input():
    allChar[ord(char) - ord('A')] += 1

for char in input():
    allChar[ord(char) - ord('A')] += 1

for char in input():
    allChar[ord(char) - ord('A')] -= 1

allCorrect = True
for num in allChar:
    if num != 0:
        allCorrect = False
        break

print("YES" if allCorrect else "NO")