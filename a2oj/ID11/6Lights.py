# https://codeforces.com/problemset/problem/275/A


# Note: WORNG!! Thanks to python not throwing exception for -ve indices

# matrix = []
# matrix.append([int(num) for num in input().split()])
# matrix.append([int(num) for num in input().split()])
# matrix.append([int(num) for num in input().split()])

# result = [[1,1,1],[1,1,1],[1,1,1]]

# print(result)
# row = 0
# while(row < 3):
#     col = 0
#     while(col < 3):
#         if matrix[row][col]%2 == 1:
#             result[row][col] = 1 if (result[row][col] == 0) else 0
#             try:
#                 result[row-1][col] = 1 if (result[row-1][col]==0) else 0
#                 # print("marking ", row-1, col)
#             except:
#                 # print("Here for ", row-1, col)
#                 pass
#             try:
#                 result[row][col-1] = 1 if (result[row][col-1]==0) else 0
#                 # print("marking ", row, col-1)
#             except:
#                 # print("Here for ", row, col-1)
#                 pass
#             try:
#                 result[row][col+1] = 1 if (result[row][col+1]==0) else 0
#                 # print("marking ", row, col+1)
#             except:
#                 # print("Here for ", row, col+1)
#                 pass
#             try:
#                 result[row+1][col] = 1 if (result[row+1][col]==0) else 0
#                 # print("marking ", row+1, col)
#             except:
#                 # print("Here for ", row+1, col)
#                 pass
#         col += 1
#     row += 1

# print(result)


matrix = []
matrix.append([int(num) for num in input().split()])
matrix.append([int(num) for num in input().split()])
matrix.append([int(num) for num in input().split()])

result = [[1,1,1],[1,1,1],[1,1,1]]

row = 0
while(row < 3):
    col = 0
    while(col < 3):
        if matrix[row][col]%2 == 1:
            result[row][col] = 1 if (result[row][col] == 0) else 0
            if (row-1>=0 and row-1<=2 and col>=0 and col<=2):
                result[row-1][col] = 1 if (result[row-1][col]==0) else 0
            if (row>=0 and row<=2 and col-1>=0 and col-1<=2):
                result[row][col-1] = 1 if (result[row][col-1]==0) else 0
            if (row+1>=0 and row+1<=2 and col>=0 and col<=2):
                result[row+1][col] = 1 if (result[row+1][col]==0) else 0
            if (row>=0 and row<=2 and col+1>=0 and col+1<=2):
                result[row][col+1] = 1 if (result[row][col+1]==0) else 0                                            
        col += 1
    row += 1

for row in result:
    for num in row:
        print(num, end='')
    print()