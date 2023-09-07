count = 0

def nprint():
	global count
	if count == 3:
		return None
	count += 1
	print(count)
	nprint()	


nprint()
