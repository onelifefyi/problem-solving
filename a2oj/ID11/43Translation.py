# https://codeforces.com/problemset/problem/41/A

# Time O(n) | Aux space O(1)
word1 = input()
word2 = input()[::-1]
print("YES" if word1==word2 else "NO")