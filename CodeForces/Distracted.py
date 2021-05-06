# https://codeforces.com/problemset/problem/1520/A

# :INCOMPLETE:


freq = [0] * 26
arr = [ch for ch in input()]

current = arr[0]
for index, ch in enumerate(arr):
    if freq[index] == -1:
        print("NO")
        break
    freq[index] = 1
    if ch != current:
        freq[index-1] = -1
