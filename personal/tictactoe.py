# Tic Tac Toe - to get back in programming

grid = [["-", "-", "-"], ["-", "-", "-"], ["-", "-", "-"]]


def show_grid():
    for row in grid:
        for val in row:
            print(val, "", end="")
        print()
    print()


def mark(row, col, val):
    grid[row][col] = val


def game_over():
    # check rows
    for row in range(3):
        if (
            grid[row][0] != "-"
            and grid[row][0] == grid[row][1]
            and grid[row][0] == grid[row][2]
        ):
            return True

    # check cols
    for col in range(3):
        if (
            grid[0][col] != "-"
            and grid[0][col] == grid[1][col]
            and grid[0][col] == grid[2][col]
        ):
            return True

    # check diagonal
    if grid[0][0] != "-" and grid[0][0] == grid[1][1] and grid[0][0] == grid[1][1]:
        return True

    if grid[0][2] != "-" and grid[0][2] == grid[1][1] and grid[0][2] == grid[2][0]:
        return True

    return False


def play_game():
    print("Welcome to tic tac toe, player 1 start with 'X', player two has 'O'")

    winner = False
    player_one_turn = True
    while not winner:
        show_grid()
        if player_one_turn:
            pos_x, pos_y = [
                int(_)
                for _ in input(
                    "Player 1, enter position separated by space (X, Y): "
                ).split()
            ]
            mark(pos_x, pos_y, "X")
        else:
            pos_x, pos_y = [
                int(_)
                for _ in input(
                    "Player 2, enter position separated by space (X, Y): "
                ).split()
            ]
            mark(pos_x, pos_y, "O")
        player_one_turn = not player_one_turn
        winner = game_over()

    show_grid()
    if player_one_turn:
        print("Player 2 is the winner")
    else:
        print("Player 1 is the winner")


play_game()
