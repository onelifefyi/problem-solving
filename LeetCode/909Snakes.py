def snakesAndLadders(board):
	# converting to 1d list
	board_1d = []
	for index, row in enumerate(board[::-1]):
		board_1d += row if index%2 == 0 else row[::-1]
	board = board_1d
	
	move_to_reach = [0]*len(board)
	position = 0
	moves = 0
	print(board)
	while position < len(board) - 7:
		moves += 1
		for i in range(1, 7):
			if board[position+i] != -1:
				move_to_reach[board[position+i]-1] = moves
			move_to_reach[position+i] = moves

		position += 1
	print(move_to_reach)

	return move_to_reach[-1]

board1 = [[-1,-1,-1,-1,-1,-1],[-1,-1,-1,-1,-1,-1],[-1,-1,-1,-1,-1,-1],[-1,35,-1,-1,13,-1],[-1,-1,-1,-1,-1,-1],[-1,15,-1,-1,-1,-1]]
board2 = [[-1,-1],[-1,3]]

print(snakesAndLadders(board1))
