def subArrayExists(arr, n):
	n_sum = 0
	s = set()

	for i in range(n):
		n_sum += arr[i]

		if n_sum == 0 or n_sum in s:
			return True
		s.add(n_sum)

	return False


css = int(input())
for i in range(css):
    numList = input().split()
    arr = [int(num) for num in numList]
    n = len(arr)
    if subArrayExists(arr, n) == True:
        print("true")
    else:
        print("false")