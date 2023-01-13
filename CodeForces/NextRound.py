n, k = [int(num) for num in input().split()]
scores = [int(num) for num in input().split()]

count = 0
for score in scores:
	if score >= scores[k-1] and score > 0:
		count += 1
print(count)
