
# https://codeforces.com/contest/1676/problem/C
# How to find out the optimal character to bring every word's char to?
# Idea: Bring every character to it's nearest pair (in single direction i.e, large to small or small to large)
#       And at the end, move the one with min number of characters

def getMinTravel(charList):
    charList.sort()
    # . . . IDK


css = int(input())
for _ in range(css):
    words, size = [int(x) for x in input().split(' ')]
    for x in range(words):
        wordsList = input().split('')
    total = 0
    for y in range(size):
        toCompare = []
        for word in wordsList:
            toCompare.append(word[y])
        total += getMinTravel(toCompare)
    print(total)