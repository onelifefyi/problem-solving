# https://www.youtube.com/watch?v=yGCQ9if5I-8&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=5

# Done but need to solve with form
def printPattern(num):
    start = 1
    for i in range(num):
        for j in range(num):
            # condition in this indendation
            if j < num-i-1:
                print(' ',end='')

        for x in range(0, start):
            print('*', end='')
        start += 2
        print('\n',end='')

printPattern(int(input()))