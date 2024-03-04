css = int(input())
for _ in range(css):
	result = 'A' if input().count('A') > 2 else 'B'
	print(result)
