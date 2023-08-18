# css = int(input())
# for _ in range(css):
#     k = [int(num) for num in input().split()][-1]
#     difficulties = sorted([int(num) for num in input().split()])
#     max_length = 0
#     length = 0
#     for index in range(len(difficulties)-1):
#         length += 1
#         if difficulties[index+1] - difficulties[index] > k:
#             max_length = max(max_length, length)
#             length = 0

#     print(len(difficulties) - max_length)


css = int(input())
for _ in range(css):
    k = [int(num) for num in input().split()][-1]
    difficulties = sorted([int(num) for num in input().split()])
    length = 1
    max_len = 0
    index = 1
    while(index < len(difficulties)):
        if difficulties[index] - difficulties[index-1] > k:
            length = 1
        else:
            length += 1
        index += 1
    
    max_len = max(max_len, length)

    print(difficulties, max_len)
    # print(difficulties, len(difficulties) - max_len)