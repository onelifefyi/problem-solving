# https://codeforces.com/problemset/problem/352/A

n = int(input())
fiveCount = 0
zeroCount = 0
for num in input().split():
    if num == '5':
        fiveCount += 1
    else:
        zeroCount += 1

if zeroCount==0:
    print(-1)
else:
    while(fiveCount>0):
        if (fiveCount*5)%9 == 0:
            print('5'*fiveCount, end='', sep='')
            break
        fiveCount -= 1
    if fiveCount==0:
        print(0)
    else:
        print('0'*zeroCount)