# https://codeforces.com/problemset/problem/230/A

# Time O(nlogn) | Aux space O(n)
strength, n = [int(_) for _ in input().split()]

# dragons = []
# for strengthNeeded in input().split():
#     dragons.append([int(strengthNeeded),0])

# for index, strengthGained in enumerate(input().split()):
#     dragons[index][1] = int(strengthGained)

dragons = []
for _ in range(n):
    dragons.append([int(num) for num in input().split()])

dragons.sort()

possible = True
for lvl in range(len(dragons)):
    if(strength <= dragons[lvl][0]):
        possible = False
        break
    else:
        strength += dragons[lvl][1]

print("YES" if possible else "NO")