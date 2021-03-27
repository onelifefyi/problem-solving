# https://codeforces.com/problemset/problem/59/A

word = input()

lCount = 0
uCount = 0
for char in word:
    if ord(char) < 97:
        uCount += 1
    else:
        lCount += 1

if lCount >= uCount:
    print(word.lower())
else:
    print(word.upper())