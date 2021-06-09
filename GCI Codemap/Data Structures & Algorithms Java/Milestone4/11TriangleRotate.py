# https://www.youtube.com/watch?v=rx-muNpSs_g&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=11

def printPattern(num):
    k = 0
    for row in range(num):
        for col in range((num+1)//2):
            if col<=k:
                print('*', end='')
            else:
                print(' ', end='')
        print('\n')
        k = k+1 if row<num//2 else k-1


printPattern(int(input()))

'''
*
**
***
**
*
row col
0   0
1   01
2   012
3   01
4   0
'''