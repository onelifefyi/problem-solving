## Find the sum from 1 to n

# Method 1
# Time O(n) | Aux Space O(1) 
def sum1(n):
    final_sum = 0
    for x in range(n+1):
        final_sum += x
    return final_sum

# Method 2 
# Time O(1) | Aux Space O(1)
def sum2(n):
    return n*(n+1)/2

print(sum1(100))
print(sum2(100))