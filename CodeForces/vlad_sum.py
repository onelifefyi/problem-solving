css = int(input())
for _ in range(css):
	n = int(input())
	complete = n//10
	result = 0
	for m_factor in range(complete):
		result += 45 + (m_factor * 10)
	result += (n%10)*(n%10 + 1)/2 + (n%10) * complete
	print(result)