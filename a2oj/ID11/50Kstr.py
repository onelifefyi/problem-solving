# https://codeforces.com/problemset/problem/219/A
# Good One | String

# Time O(len(string)) | space O(1) fixed 26 chars

k = int(input())

freq = [0] * 26
for ch in input():
    freq[ord(ch) - ord('a')] += 1

result = ''
notKstr = False

for index, num in enumerate(freq):
    if num == 0:
        pass
    if num%k != 0:
        notKstr = True
        break
    else:
        result += chr(index + ord('a'))*(int(num/k))

if notKstr:
    print(-1)
else:
    print(result*k)