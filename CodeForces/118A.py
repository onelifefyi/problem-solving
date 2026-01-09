# https://codeforces.com/problemset/problem/118/A

word = input().lower()
res = ""
for ch in word:
    if ch not in "aeiouy":
        res += "."
        res += ch

print(res)
