# https://codeforces.com/problemset/problem/43/A

n = int(input())

A = ['',0]
B = ['',0]
for _ in range(n):
    scorer = input()
    if(_ == 0):
        A[0] = scorer
    if(A[0] == scorer):
        A[1] = A[1] + 1
    else:
        B[0] = scorer
        B[1] = B[1] + 1

print(A[0] if A[1] > B[1] else B[0])