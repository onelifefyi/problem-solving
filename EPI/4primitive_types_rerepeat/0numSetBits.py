def findSetBits(num):
    count = 0
    while num:
        if num & 1 == 1:
            count += 1
        num = num >> 1
    return count


num = int(input())
print(findSetBits(num))