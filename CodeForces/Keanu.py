# https://codeforces.com/problemset/problem/1189/A

_ = input()
matrix = input()
count1 = matrix.count('1')
count0 = matrix.count('0')

if count1==count0:
    print(2)
    print(matrix[0], matrix[1:])
else:
    print(1)
    print(matrix)
