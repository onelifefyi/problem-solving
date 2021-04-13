# https://codeforces.com/problemset/problem/445/A

# Time O(row*col) | aux space O(row*col)
row, col = [int(num) for num in input().split()]

board = []
for r in range(row):
    board.append([ch for ch in input()])

even = "BW" * (col//2)
even += "B" if col%2==1 else ""

odd = "WB" * (col//2)
odd += "W" if col%2==1 else ""

result = []
for r in range(row):
    result.append([ch for ch in (even if r%2==0 else odd)])

r=0
while(r<row):
    c = 0
    while(c<col):
        if(board[r][c]=='-'):
            result[r][c]='-'
        c += 1
    r += 1

r=0
while(r<row):
    c = 0
    while(c<col):
        print(result[r][c],end="")
        c += 1
    print()
    r += 1

