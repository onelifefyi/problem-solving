# https://leetcode.com/problems/counting-bits/

# Approach:
# I can't be doing hamming weight for all the individual numbers, it's not super efficient
# I can go with the fact that at each power of two, there's one added bit, + the previous sequence repeats
# Can store in an array, all the previous states, and build based on that
# Better implementation with i - power, than two loops (thank claude)
# Time O(n) | Space O(n)
def countBits(n):
    num_bits = [0] * (n + 1)
    power = 1                          # start of the current power-of-two block
    for i in range(1, n + 1):
        if i == power * 2:             # crossed into the next block
            power *= 2
        # power is i's leading bit; i - power is the same number without it,
        # already computed -> "the previous sequence repeats", +1 for the leading bit
        num_bits[i] = 1 + num_bits[i - power]
    return num_bits


n = 128
print(countBits(n))
