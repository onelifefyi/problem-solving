str1 = [ch for ch in input().lower()]
str2 = [ch for ch in input().lower()]

result = 0
for i in range(len(str1)):
	if str1[i] != str2[i]:
		result = 1 if str1[i] > str2[i] else -1
		break
print(result)
