k = int(input())
l = int(input())
m = int(input())
n = int(input())
d = int(input())

count = 0

for dragonNum in range(1, d+1):
	if dragonNum%k==0 or dragonNum%l==0 or dragonNum%m==0 or dragonNum%n==0:
		count += 1
print(count)
