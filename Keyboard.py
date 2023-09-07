# Problem: https://codeforces.com/problemset/problem/831/B

layout1 = input()
layout2 = input()

inputString = input()

dict = {}

for i in range(len(layout1)):
    dict[layout1[i]] = layout2[i]
    dict[chr(ord(layout1[i])-32)] = chr(ord(layout2[i])-32)

for ch in inputString:
    print(dict.get(ch, ch), end='')