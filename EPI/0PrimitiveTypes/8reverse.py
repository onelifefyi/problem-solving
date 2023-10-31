# Most brute/silly -> convert as string and then reverse and reconvert

# I got too caught up in bits that didn't even consider normal approach
# Keep modding by 10 and storing
# Time O(num_digits)

def reverse(num):
    result = 0
    while num:
        result *= 10
        result += num%10
        num = num//10
    return result

print(reverse(128))