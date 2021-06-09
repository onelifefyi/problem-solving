# https://www.youtube.com/watch?v=YqluI21SCeM&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=10

def printPattern(num):
    # Diamond can't be formed on even
    num = num-1 if num%2==0 else num
    k = 0
    for row in range(num):
        for col in range(num):
            if(col>=num//2-k and col<=num//2+k):
                print('*', end='')
            else:
                print(' ', end='')
        print('\n')
        k = k+1 if row<num//2 else k-1

printPattern(int(input()))

'''
  *
 ***
*****
 ***
  *
row col
0     2
1    123
2   01234
3    123
4     2



'''