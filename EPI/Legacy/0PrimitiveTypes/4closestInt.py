# Find the closest int with same weight (same number of set bits)
# Approach: Traverse from the right side, first occurance of non-repeating bit gets swapped
# Time O(b), where b is the number of bits

def closest_int(x):
    index = 0
    while True:
        if ((x >> index) & 1) != ((x >> (index+1)) & 1):
            mask = 1 << index | 1 << (index+1)
            return x ^ mask
        index += 1

print(closest_int(5))
