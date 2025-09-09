# O(n) time, where n is the total number of bits
# def count_bits(num):
#     count = 0
#     while num:
#         count += num & 1
#         num = num >> 1
#     return count

# O(k) time, where k = number of set bits
def count_bits(num):
    count = 0
    while num:
        count += 1
        num = num & (num - 1)
    return count

print(count_bits(15))