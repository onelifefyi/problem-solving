# https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

# Appraoch:
# Check all possible combination from i, to i+1 - n
# Time O(n^2) | Space O(1)

# Approach:
# Keep track of minPrice soo far
# For each price, find the profit using price - minPrice:
# Have a variable to keep track of max profit so far
# Time O(n) | Space O(1)

def maxProfit(prices):
    maxProfit = 0
    minPrice = prices[0]
    for price in prices:
        maxProfit = max(maxProfit, price - minPrice)
        minPrice = min(price, minPrice)
    return maxProfit

# prices = [7,1,5,3,6,4]
prices = [7,6,4,3,1]
print(maxProfit(prices))