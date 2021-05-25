# https://codeforces.com/problemset/problem/352/B

# Time O(nlogn) | aux space O(n)
# --x--

n = int(input())
seq = [int(num) for num in input().split()]

posMap = {}
for index, num in enumerate(seq):
    if num not in posMap.keys():
        posMap[num] = [index]
    else:
        posMap[num].append(index)

result = []

# O(len(seq))
def checkAP(seq):
    cd = seq[1] - seq[0]
    i = 1
    while i<len(seq)-1:
        if seq[i+1]-seq[i] != cd:
            return False
        i += 1
    return True

# O(n)
for key, value in posMap.items():
    if len(value) == 1:
        result.append([key, 0])
    elif checkAP(posMap[key]): # O(a1, a2, ... an) where a1+a2+...+an = n
        result.append([key, posMap[key][1]-posMap[key][0]])

# O(nlogn)
result.sort()

print(len(result))
for item in result:
    print(item[0], item[1])