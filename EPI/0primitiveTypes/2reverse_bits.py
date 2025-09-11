# Approach:
# Iterate & shift
# Get the least significant bit x & 1
# Use that to built result
# Keep right shifting original num and left shifting the result and add the last digit
# Time O(n) | Space O(n) where n is number of bits
def reverse_bits(x):
    result = 0
    while x:
        result = result << 1
        result = result | (x & 1)
        x = x >> 1
    return result

# Another approach is caching all possible reverse for 16 bits ^ keep iterating

x = 19
print(reverse_bits(x))