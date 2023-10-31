# We have a brute force approach, where we go through each bits and swap
# We know that performing xor operation swaps the bit
# i.e, 0 ^ 1 = 1 & 1 ^ 1 = 0
# So, we can simply perform XOR operation
# But theres a problem, what to do with all the unset bits before most significant 1
# Is there a way to find the number of significant bits? I think yes, taking log2(num)
# Not the problem, lol

# -----x------

# Now, actual problem is to swap bits at index i and j
# Brute force, first find ith index bit, then find jth index bit
# if both equal, no need to swap
# if not equal, perform xor with 1 (to flip)
# Time O(1)
def swap(num, i, j):
    ith_val = (num >> i) & 1
    jth_val = (num >> j) & 1
    if (ith_val != jth_val):
        mask = (1 << i) | (1 << j)
        num = num ^ mask
    return num


num = int(input())
i = int(input())
j = int(input())
print(swap(num, i, j))