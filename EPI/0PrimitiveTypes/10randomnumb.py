# NOTE: 0/1 random generator function is given (zero_one_random())
# Let's just make it

import random

def zero_one_random():
    return random.randint(0, 1)

def getRand(lower, upper):
    numbers_needed = upper - lower + 1
    while True:
        i = 0
        num = 0
        while((1 << i) < numbers_needed):
            num = (num << 1) | random.randint(0, 1)
            i += 1
        if (num + lower) <= upper:
            break
    return num + lower

print(getRand(1, 6))