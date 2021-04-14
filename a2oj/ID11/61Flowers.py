# https://codeforces.com/problemset/problem/459/B

# time O(n) | space O(n) | aux space O(1)

n = int(input())

flowers = [int(num) for num in input().split()]
minFlower = min(flowers)
maxFlower = max(flowers)

if(minFlower != maxFlower):
    print(maxFlower-minFlower, (flowers.count(minFlower) * flowers.count(maxFlower)))
else:
    count = flowers.count((minFlower))
    print(0, int((count-1)*count/2))