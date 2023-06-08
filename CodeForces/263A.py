for rowIndex in range(5):
    row = [int(num) for num in input().split()]
    for column, num in enumerate(row):
        if num == 1:
            print(abs(column-2) + abs(rowIndex-2))
            break