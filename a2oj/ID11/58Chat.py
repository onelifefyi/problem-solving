# https://codeforces.com/problemset/problem/58/A

# Time O(n) | Aux space O(1)

word = [ch for ch in input()]
needed = ['h','e','l','l','o']

position = 0
i = 0
while(position<5 and i<len(word)):
    if(needed[position] == word[i]):
        position += 1
    i += 1

print("YES" if position==5 else "NO")
    