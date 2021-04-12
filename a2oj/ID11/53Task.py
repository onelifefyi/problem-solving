# https://codeforces.com/problemset/problem/118/A

# Time O(n) | Aux space O(1)

word = [ch for ch in input().lower()]

for index, ch in enumerate(word):
    if ch in ['a','e','i','o','u','y']:
        word[index] = ''
    
for ch in word:
    if ch != '':
        print('.',ch,sep='',end='')