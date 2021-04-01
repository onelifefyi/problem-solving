# https://codeforces.com/problemset/problem/71/A
# Time O(n) | Aux space O(1)

css = int(input())
for i in range(css):
    word = input()
    if len(word) > 10:
        print(word[0], len(word)-2, word[-1], sep='')
    else:
        print(word)