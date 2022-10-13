# Wrong Answer in 2nd test case

css = int(input())

for _ in range(css):
    input()
    input_matrix = []
    result = ''
    for i in range(8):
        row = [ch for ch in input()]
        input_matrix.append(row)
        # print("INPUT ROW: ", row)
        if len(set(row)) == 1 and row[0] != '.':
            result = row[0]
            # print("Got result, ", result)

    if result not in ['R', 'B']:
        for col in range(8):
            seq = 0
            col_set = set()
            # print("col", col)
            for row in range(8):
                col_set.add(input_matrix[row][col])
            if len(col_set) == 1 and list(col_set)[0] != '.':
                result = input_matrix[0][col]
                break
    print(result)