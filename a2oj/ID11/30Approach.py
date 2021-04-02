# https://codeforces.com/problemset/problem/227/B
# Mistake #1 There are distinct elements, no need to check for repeated elements

# Finally solved: (Looked at editorial a bit)
# Note: It's okay to create large sized arrays if it saves iteration time!!



# Getting Timeout
# n = int(input())
# arr = input().split()
# m = input()

# totalLeft = 0
# totalRight = 0
# for ch in input().split():
# #     first = True
# #     countLeft = 0
# #     countRight = 0
#     # for index, val in enumerate(arr):
#     #     if val == ch:
#     #         if first:
#     #             countLeft = index +1
#     #             countRight = n - index
#     #             first = False
#     #         else:
#     #             countRight = n - index
#     # totalLeft += countLeft
#     # totalRight += countRight
#     index = arr.index(ch)
#     totalLeft += index + 1
#     totalRight += n - index

# print(totalLeft, totalRight)


# Time O(n) | Aux space O(1)
n = int(input())
indList = [None] * 1000001

for index, char in enumerate(input().split()):
    indList[int(char)] = index

input()

totalLeft = 0
totalRight = 0
for ch in input().split():
    totalLeft += indList[int(ch)] + 1
    totalRight += n - indList[int(ch)]

print(totalLeft, totalRight)