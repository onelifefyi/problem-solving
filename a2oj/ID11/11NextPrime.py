# https://codeforces.com/problemset/problem/80/A
# Time O(?) | Space O(1)

import math

_ = input().split()
n = int(_[0])
next = int(_[1])

def isPrime(n):
    count = 1
    for i in range (2, int(math.sqrt(n))+1):
        if n%i == 0:
            return False
    return True
        

def getNextPrime(n):
    n += 1
    while(not isPrime(n)):
        n += 1
    return n

print("YES" if getNextPrime(n)==next else "NO")