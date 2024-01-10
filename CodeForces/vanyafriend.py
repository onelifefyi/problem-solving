_, fence_height = [int(i) for i in input().split()]
heights = [int(i) for i in input().split()]

width = 0
for height in heights:
    if height > fence_height:
        width += 2
    else:
        width += 1

print(width)