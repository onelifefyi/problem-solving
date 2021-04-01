# https://codeforces.com/problemset/problem/151/A
# Time O(1) | aux space O(1) 
# Note: IDK why but the one below time taken is less (complexity comes to play at scale perhaps)

ingredients = input().split()

friends = int(ingredients[0])
bottles = int(ingredients[1])
capacity = int(ingredients[2])
limes = int(ingredients[3])
slices = int(ingredients[4])
salt = int(ingredients[5])

drinkNeeded = int(ingredients[6])
saltNeeded = int(ingredients[7])
limeNeeded = 1

totalDrink = bottles * capacity
totalLime = limes * slices
totalSalt = salt

# Time O(n) | aux space O(1)

# toasts = 0
# while True:
#     totalDrink -= friends*drinkNeeded
#     totalSalt -= friends*saltNeeded
#     totalLime -= friends*1

#     if totalDrink>=0 and totalSalt>=0 and totalLime>=0:
#         toasts += 1
#     else:
#         break

# print(toasts)

maxDrink = totalDrink // (friends*drinkNeeded)
maxSalt = totalSalt // (friends*saltNeeded)
maxLime = totalLime // friends

print(min(maxDrink, maxLime, maxSalt))