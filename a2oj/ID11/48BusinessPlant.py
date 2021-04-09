# https://codeforces.com/problemset/problem/149/A

# Time O(1) | aux space O(1)

k = int(input())

growth = [int(num) for num in input().split()]
growth.sort(reverse=True)

i = 0
length = 0
while(i<12):
    length += growth[i]
    if length >= k:
        break
    i += 1
if k==0:
    print(0)
else:
    print(i+1 if length >= k else -1)