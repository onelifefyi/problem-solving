# https://leetcode.com/problems/counting-bits/ 

# Approach:
# Can perform hamming weight n times 
# Time O(n*b), where b is the # bits for nth bit | Space O(n)

# Approach:
# Can use dynamic programming (IDK if that's the right term)
# I know what each term is going to look like
# Eg, for 2, = 1 + arr[2%2], for 3, = 1 + arr[2%3]
# For 4, = 1 + arr[4%4]... and so on idk how to implement
# Can use two variables to keep track of curr and nextLimit

# Time O(n) | Space O(n)
def countBits(n):
    if n == 0: return [0]
    if n == 1: return [0, 1]
    res = [0] * (n+1)
    res[1] = 1

    currLimit = 1
    nextLimit = 2
    for i in range(2, n+1):
        if i == nextLimit:
            currLimit = nextLimit
            nextLimit = nextLimit * 2
        res[i] = 1 + res[i - currLimit]
    return res

# n = 5
n = 8
print(countBits(n))