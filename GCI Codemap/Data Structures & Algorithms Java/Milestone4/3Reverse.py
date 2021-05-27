# https://www.youtube.com/watch?v=63R1UuaFQVE&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=3

def printPattern(num):
    for i in range(num):
        for j in range(num):
            # condition in this indendation
            if j >= i:
                print('*',end='')
            else:
                print(' ',end='')
        print('\n',end='')

printPattern(int(input()))