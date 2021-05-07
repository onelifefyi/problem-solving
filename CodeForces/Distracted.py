# https://codeforces.com/problemset/problem/1520/A
# Time O(n) | Space O(1) 

css = int(input())
for _ in range(css):
    freq = [0] * 26
    suspecious = False

    lenArr = input()
    arr = [ch for ch in input()]
    current = arr[0]

    for index, ch in enumerate(arr):
        if freq[ord(ch) - ord('A')] > 0:
            if arr[index] != arr[index-1]:
                suspecious = True
                break
        freq[ord(ch) - ord('A')] += 1

    print("NO" if suspecious else "YES")