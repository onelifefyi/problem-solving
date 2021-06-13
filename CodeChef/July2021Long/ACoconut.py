import math
n = int(input())

for _ in range(n):
    waterPer, pulpPer, waterNeed, pulpNeed = [int(num) for num in input().split(' ')]
    print(math.ceil(waterNeed/waterPer) + math.ceil(pulpNeed/pulpPer))