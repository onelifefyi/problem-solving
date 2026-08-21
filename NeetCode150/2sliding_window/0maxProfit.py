# https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

# Approach:
# The simplest approach is to check every possible subsequent pair
# Time O(n^2) | Space O(1)

# Better:
# Keep track of min stock price yet, and calculate max profit
# Return max profit
# Time O(n) | Space O(1)

def maxProfit(prices):
    min_price_yet = prices[0] # assuming the list is non empty
    max_profit = 0
    for price in prices[1:]:
        min_price_yet = min(min_price_yet, price)
        max_profit = max(max_profit, price - min_price_yet)
    return max_profit

prices = [7,1,5,3,6,4]
print(maxProfit(prices))
