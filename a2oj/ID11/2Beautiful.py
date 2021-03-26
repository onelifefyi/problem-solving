# https://codeforces.com/problemset/proUntitled-1blem/263/A
# Time O(1) | Space O(1)

sum = 0
for row in range(5):
    lst = [int(num) for num in input().split()]
    if 1 in lst:
        sum += abs(row+1-3) + abs(lst.index(1)+1-3)
        print(sum)