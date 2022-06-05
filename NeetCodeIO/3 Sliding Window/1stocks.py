# Time O(n) | Space O(1)
def maxProfit(prices):
    minSoFar = prices[0]
    bestSoFar = 0
    for num in prices:
        if num < minSoFar:
            minSoFar = num
        bestSoFar = max(num - minSoFar, bestSoFar)
    return bestSoFar

prices = [int(num) for num in input().split(' ')]
print(maxProfit(prices))