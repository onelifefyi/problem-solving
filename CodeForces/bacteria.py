# https://codeforces.com/problemset/problem/579/A

# We essentially need to find the number of set bits
def getNumBact(num):
    count = 0
    while num:
        count += 1
        num = num & (num-1)
    return count

num = int(input())
print(getNumBact(num))