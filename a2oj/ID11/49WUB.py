# https://codeforces.com/problemset/problem/208/A

# Python makes it really easy
# Time O(n) | aux space O(len(inputString))

# Need to learn more about how space complexity is computed

dub = input().split('WUB')

for word in dub:
    if word == '':
        pass
    else:
        print(word, end=' ')