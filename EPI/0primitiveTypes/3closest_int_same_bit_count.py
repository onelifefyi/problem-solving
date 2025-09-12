# Approach
# I guess most intuitive approach is the most optimal
# Now, since we want to keep the difference minimal, 
# We should focus on least significant bits
# Now, anytime starting from right hand side (least significance)
# There's a difference present, swap it
# Time O(n) where n is the number of bits of the number
# Space O(1)

def closest_int_same_bit_count(x):
    right = 0
    left = 1
    while True:
        if (x >> right) & 1 != (x >> left) & 1:
            x = (x ^ (1 << right)) | (x ^ (1 << left))
            return x
        right += 1
        left += 1

x = int(input())
print(closest_int_same_bit_count(x))