# http://codeforces.com/problemset/problem/339/B
# Time O(m) | Aux Space O(1)

l1 = input().split()
l2 = input().split()

n = int(l1[0])
m = int(l1[1])

current = 1
i = 0
time = 0
while m>0:
    if current <= int(l2[i]):
        time += int(l2[i])-current
        current = int(l2[i])
    else:
        time += n-current+int(l2[i])
        current = int(l2[i])
    m -= 1
    i += 1

print(time)