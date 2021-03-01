# https://codeforces.com/problemset/problem/734/B

# This would get time limit exceeded
# arg = []
# for _ in input().split(' '):
#     arg.append(int(_))

# sum = 0
# while(arg[0]>0 and arg[2]>0 and arg[3]>0):
#     sum += 256
#     arg[0] -= 1
#     arg[2] -= 1
#     arg[3] -= 1

# while(arg[0]>0 and arg[1]>0):
#     sum += 32
#     arg[0] -= 1
#     arg[1] -= 1

# print(sum)


# Better One:
arg = []
for _ in input().split(' '):
    arg.append(int(_))

sum = 0
count = min(arg[0], arg[2], arg[3])
sum += 256*count

arg[0] -= count
arg[2] -= count
arg[3] -= count

count = min(arg[0], arg[1])
sum += 32*count

print(sum)