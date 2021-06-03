# https://www.youtube.com/watch?v=O0iAjT27nZQ&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=7

def printPattern(num):
    for i in range(num):
        for j in range(2*num-1):
            if j<=num-1-i or j>=num-1+i:
                print('*', end='')
            else:
                print(' ', end='')
        print('\n')

printPattern(int(input()))