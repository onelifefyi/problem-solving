css = int(input())
for _ in range(css):
    participants = int(input())
    winner = 0
    score = 0
    for participant in range(1, participants+1):
        words_and_score = [int(num) for num in input().split()]
        if words_and_score[0] <= 10:
            winner = participant if words_and_score[1] > score else winner
            score = max(score, words_and_score[1])
    print(winner)