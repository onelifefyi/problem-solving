# https://leetcode.com/problems/happy-number/description/

# Approach:
# ummm... this problems seems... way too simple? IDK, what I'm supposed to do, just follow the process?
# surely I'm missing something

# Time O(?) | Aux space (?) | Is there some way to know for sure??

def getSquaredSum(n):
    total = 0
    while n:
        total += (n % 10) ** 2
        n //= 10
    return total

def isHappy(n):
    visited = set()
    while n != 1:
        if n in visited: return False
        visited.add(n)
        n = getSquaredSum(n)
    return True

n = 19
print(isHappy(n))
