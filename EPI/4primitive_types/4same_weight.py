# EPI page 28

# Since weight must be same & it should be closest
# We can take the least significant set bit and move it to lower significance if available
# This approach is wrong, b'cos the next bit can be far away,
# increasing the difference way too much

# One correct approach is to swap the least significant pair (rightmost) which are different
# This way, difference between will be minimum
# Time O(k) where k is the max possible bit size (64 in most cases)
# Space O(1)
def closest_int_same_bit_count(num):
    position = 0
    while True:
        if (num>>position & 1) != (num>>(position+1) & 1):
            mask = 1<<position | 1<<(position+1)
            num = num ^ mask
            break
        position += 1
    return num

num = int(input())
print(closest_int_same_bit_count(num))