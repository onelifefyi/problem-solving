css = int(input())

for _ in range(css):
	grid_size = int(input())
	last_row = 0
	result = ""
	for row in range(grid_size):
		row_val = input().count("1")
		if len(result) > 0:
			continue
		if row_val > 0 and last_row > 0:
			result = "SQUARE" if row_val == last_row else "TRIANGLE"
		last_row = row_val
	print(result)
