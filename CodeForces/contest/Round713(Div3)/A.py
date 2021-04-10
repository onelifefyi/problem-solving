css = int(input())
for _ in range(css):
    n = int(input())
    nums = []
    freq = [0]*101
    for num in input().split():
        nums.append(int(num))
        freq[int(num)] += 1

    for index, val in enumerate(freq):
        if val == 1:
            print(nums.index(index) + 1)
            break