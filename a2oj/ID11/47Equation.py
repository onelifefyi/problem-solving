# https://codeforces.com/problemset/problem/214/A

# Time O(IDK) | Aux Space O(1)
n, m = [int(num) for num in input().split()]

a, b = 0, 0

count = 0
while(a <= n+m):
    b = 0
    while(b <= n+m):
        s1 = a**2 + b
        s2 = a + b**2
        if(s1 > n or s2 > m):
            break
        if s1 == n and s2 == m:
            count += 1
        b += 1
    a += 1

print(count)