# https://codeforces.com/problemset/problem/112/A
# Time O(n) | Aux Space O(1)
word1 = input().lower()
word2 = input().lower()

if word1 == word2:
    print(0)
else:
    for i in range(0, len(word1)):
        if word1[i] < word2[i]:
            print(-1)
            break
        elif word1[i] > word2[i]:
            print(1)
            break