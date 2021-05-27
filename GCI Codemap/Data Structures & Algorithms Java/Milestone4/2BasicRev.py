# https://www.youtube.com/watch?v=hje73IXa8hI&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=2
# See 1Structure for base structure

def printPattern(num):
    for i in range(num):
        for j in range(num):
            # condition in this indendation
            if j >= num-1 - i:
                print('*',end='')
            else:
                print(' ',end='')
        print('\n',end='')

printPattern(int(input()))