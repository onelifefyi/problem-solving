# https://codeforces.com/problemset/problem/337/A

# Time O(nlogn) | aux space O(1)
students, n = [int(num) for num in input().split()]

puzzle = [int(num) for num in input().split()]
puzzle.sort()

smallest = 1001
position = 0
while(position + students <= n):
    smallest = min(smallest, puzzle[position+students-1]-puzzle[position])
    position += 1

print(smallest)