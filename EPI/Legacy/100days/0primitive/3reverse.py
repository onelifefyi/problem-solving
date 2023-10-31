# Reversing the bits is just swapping, so we can use the last program
# Time O(n) | Space O(1)

# Another way, still O(n) but slower than the other one is to just keep going through the bits and populate it at the end
# Assuming that the input number is represented in 64 bits
def reverse_bits(x):
    result = 0
    position = 63
    while x:
        result = result | (x&1) << position
        position -= 1
        x = x >> 1
    return result

print(reverse_bits(1))