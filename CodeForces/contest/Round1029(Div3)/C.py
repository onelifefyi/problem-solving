# Try to minimize partision size
css = int(input())
for _ in range(css):
    length = int(input())
    nums = [int(num) for num in input().split()]
    result = 0
    curr_list = [nums[0]]
    index = 1
    while index < length:
        visited_list = curr_list.copy()
        curr_list = []
        while visited_list and index<length:
            # print("test", visited_list, curr_list, index, result)
            num = nums[index]
            curr_list.append(num)
            if num in visited_list:
                visited_list.remove(num)
            index += 1
        result += 1
    if not visited_list: result += 1
    print(result)
