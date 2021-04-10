css = int(input())
for _ in range(css):
    order = int(input())
    matrix = []
    position = []
    row = 0
    while row<order:
        r = [ch for ch in input()]
        matrix.append(r)
        for index, ch in enumerate(r):
            if ch == '*':
                position.append([row, index])
        row += 1

    # print(position)
    # row same:
    if position[0][0] == position[1][0]:
        if position[0][0] >= 1:
            matrix[position[0][0]-1][position[0][1]] = '*'
            matrix[position[0][0]-1][position[1][1]] = '*'
        else:
            matrix[position[0][0]+1][position[0][1]] = '*'
            matrix[position[0][0]+1][position[1][1]] = '*'
    elif position[0][1] == position[1][1]:
        if position[0][1] >= 1:
            matrix[position[0][0]][position[0][1]-1] = '*'
            matrix[position[1][0]][position[1][1]-1] = '*'
        else:
            matrix[position[0][0]][position[0][1]+1] = '*'
            matrix[position[1][0]][position[1][1]+1] = '*'
    else:
            matrix[position[0][0]][position[1][1]] = '*'
            matrix[position[1][0]][position[0][1]] = '*'        
    
    for row in matrix:
        for ch in row:
            print(ch, sep='', end='')
        print('')
    