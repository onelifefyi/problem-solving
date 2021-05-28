# https://www.youtube.com/watch?v=rPPbyLq_hDo&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=4

# 
def printPattern(num):
    for i in range(num):
        for j in range(num):
            # condition in this indendation
            if j < num-i:
                print('*',end='')
            else:
                print(' ',end='')

        print('\n',end='')

printPattern(int(input()))