# Need to find another num which has same number of set bits & is closest
# I think the best way is to work with least significant bits, let's see...
# Cool, all we need to do is take the least significant bit and as soon as any unset bit to it's right is encountered, swap
# This is a wrong approach
# def nearest_weight(num):
#     test = num
#     found_set = False
#     index = 0
#     while test:
#         if not found_set and (test & 1 == 1):
#             mask = 1 << index
#             found_set = True
#             print("set: ", index)
#         test = test >> 1
#         index = index + 1
#         if found_set and (test & 1 == 0):
#             print("set: ", index)
#             mask = mask | (1 << index)
#             num = num ^ mask
#             break
#     return num
    

# Correct: Swap the rightmost two bits which differ
def nearest_weight(num):
    test = num
    index = 0
    while test:
        if(test & 1) != ((test >> 1) & 1):
            mask = (1 << index) | (1 << (index+1))
            num = num ^ mask
            break
        test = test >> 1
        index += 1
    return num


num = int(input())
# print(bin(num))
# print(bin(nearest_weight(num)))
print(nearest_weight(num))