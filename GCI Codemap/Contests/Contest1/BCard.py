n = int(input())
cards = [int(num) for num in input().split()]
leftPtr = 0
rightPtr = n-1
sScore = 0
dScore = 0
sTurn = True

while(leftPtr<=rightPtr):
    if(cards[leftPtr] >= cards[rightPtr]):
        best = cards[leftPtr]
        leftPtr += 1
    else:
        best = cards[rightPtr]
        rightPtr -= 1
    if sTurn:
        sScore += best
        sTurn = False
    else:
        dScore += best
        sTurn = True

print(sScore, dScore)