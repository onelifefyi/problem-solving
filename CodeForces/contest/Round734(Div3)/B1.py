# https://codeforces.com/contest/1551/problem/B1
css = int(input())

for zz in range(css):
    freqTable = [0]*26
    for ch in input():
        freqTable[ord(ch) - ord('a')] += 1
    total = 0
    for i in freqTable:
        if i!=0:
            total += 1 if i==1 else 2
    print(total//2)