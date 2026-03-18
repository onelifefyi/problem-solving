# https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

# Approach
# Brute - try all possible combinations 
# Time O(n^2) | Space O(1)

# Approach 2 - 2 pointers
# Keep track of min and max profit possible as iterating
# At the end return max profit
# Time O(n^2) | Space O(1)
def maxProfit(prices):
    min_price, max_profit = prices[0], 0
    for price in prices:
        min_price = min(price, min_price)
        max_profit = max(max_profit, price - min_price)
    return max_profit

prices = [7,1,5,3,6,4]
print(maxProfit(prices))