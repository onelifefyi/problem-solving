def numberOfSteps(num):
    count = 0
    while(num):
        if(num % 2 == 0):
            num = num >> 1
        else:
            num = num - 1
        count += 1
    return count

num = int(input())
print(numberOfSteps(num))