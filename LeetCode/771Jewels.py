# https://leetcode.com/problems/jewels-and-stones/

# Time O(len(jewels) * len(stones))
# def numJewelsInStones(jewels, stones):
#     count = 0
#     for ch in stones:
#         if ch in jewels:
#             count += 1
#     return count

# Time O(j + s) where they represent length of jewels and stones respectively
def numJewelsInStones(jewels, stones):
    jewelSet = set(jewels)
    # for jewel in jewels:
    #     jewelSet.add(jewel)
    count = 0
    for stone in stones:
        if stone in jewelSet:
            count += 1
    return count

jewels = input()
stones = input()

print(numJewelsInStones(jewels, stones))