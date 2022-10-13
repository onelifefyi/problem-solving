# Time limit exceeded on 3rd case
css = int(input())

for _ in range(css):
    input()
    stair_length = [int(num) for num in input().split()]
    leg_length = [int(num) for num in input().split()]

    for leg in leg_length:
        result_height = 0
        for stair in stair_length:
            if leg >= stair:
                result_height += stair
            else:
                break
        print(result_height, end=' ')
    print()