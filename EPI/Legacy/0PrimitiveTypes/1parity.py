# Approach 1 -> time O(n) -> count bits and get parity

# Approach 2 -> Precompute the parity of smaller combinations of bits and then use that

# Approach 3 -> time O(log(n)), Get parity against the same number. 
# Divide the number in half, perform XOR operation, again divide till 1 number is left.

# Assuming that the bin number is represented in 64 bits, it'll take 6(+1) XOR computation
def parity(num):
    num ^= num >> 32
    num ^= num >> 16
    num ^= num >> 8
    num ^= num >> 4
    num ^= num >> 2
    num ^= num >> 1
    return num & 1

print(parity(16))