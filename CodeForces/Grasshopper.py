# Problem: https://codeforces.com/problemset/problem/735/A

import sys

n, hop = input().split(' ')

path = [char for char in input()]

# print(path)

gPosition = path.index('G')
iPosition = path.index('T')

if gPosition > iPosition:
    # print(path)
    path.reverse()
    # print(path)
    gPosition = path.index('G')
    iPosition = path.index('T')

# print(hop, ": Hop")
# print(iPosition, ": iPosition")
# print(gPosition, ": gPosition")
# for i in range(gPosition, iPosition+1, int(hop)):
    # print(i)

if(abs(gPosition-iPosition) % int(hop) == 0):
    for index in range(gPosition, iPosition+1, int(hop)):
        if path[index] == 'T':
            print("YES")
            sys.exit()
        elif path[index] == '#':
            print("NO")
            sys.exit()
print("NO")