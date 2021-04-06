# https://codeforces.com/problemset/problem/139/A
# Time O(1) | Aux Space O(1)
nPages = int(input())

freq = []
sum = 0
tmp = 0
for num in input().split():
    freq.append(int(num))
    sum += int(num)

nPages = sum if nPages%sum==0 else nPages%sum

i=0
while(nPages>0):
    nPages -= freq[i]
    i += 1

print(i)