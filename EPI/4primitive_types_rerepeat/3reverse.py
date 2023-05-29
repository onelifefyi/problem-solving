# Simplest way is to store all the possible reversed outputs for 16 bit
# And then keep storing it in reverse order, eg num = y1y2y3y4
# So, in place of y1 insert precomputed_rev(y4) and so on

# One brute way is to use swap function (2swap.py) for each bits
# Time O(n) where n is the word size
def swap(num, i, j):
    ith_val = (num >> i) & 1
    jth_val = (num >> j) & 1
    if (ith_val != jth_val):
        mask = (1 << i) | (1 << j)
        num = num ^ mask
    return num

def reverse(num):
    for i in range(0, 32):
        num = swap(num, i, 63-i)
    return num

num = int(input())
# print(bin(num))
# print(bin(reverse(num)))
print(reverse(num))
