# EPI page 46

# Approach | As we go through the array we can keep track of minimum so far
# and for each element calculate profit by selling, keeping track of max profit
# Time O(n) | space O(1)
def stock_profits(prices):
    min_stock = float('inf')
    max_profit = 0
    for price in prices:
        max_profit = max(max_profit, price-min_stock)
        min_stock = min(min_stock, price)
    return max_profit

prices = [int(num) for num in input().split()]
print(stock_profits(prices))

# 310 315 275 295 260 270 290 230 255 250