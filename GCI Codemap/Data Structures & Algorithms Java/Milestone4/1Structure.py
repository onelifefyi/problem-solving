# https://www.youtube.com/watch?v=6irHnysGbSI&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=1

# Below is the basic structure/map of our pattern
# This sets the boundary
# def printPattern(num):
#     for i in range(num):
#         for j in range(num):
#             print('*', end='') # This is where our pattern's condition is put
#         print('\n',end='')

def printPattern(num):
    for i in range(num):
        for j in range(num):
            if j<=i:
                print('*',end='')
            else:
                print(' ',end='')
        print('\n',end='')


printPattern(int(input()))