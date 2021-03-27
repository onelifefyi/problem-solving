# https://codeforces.com/problemset/problem/266/B
# Time O(t*n) | aux space O(1)

l1 = [int(num) for num in input().split()]
l2 = [char for char in input()]

l = l1[0]
t = l1[1]

for _ in range(t):
    i = 1
    while(i<l):
        if l2[i] == 'G' and l2[i-1] == 'B':
            l2[i] = 'B'
            l2[i-1] = 'G'
            i += 1
        i += 1

print(''.join(l2))