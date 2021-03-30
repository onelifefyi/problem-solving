# https://codeforces.com/problemset/problem/110/A
count = 0
for char in input():
    if char in ['4','7']:
        count += 1
if count in [4, 7]:
    print("YES")
else:
    print("NO")