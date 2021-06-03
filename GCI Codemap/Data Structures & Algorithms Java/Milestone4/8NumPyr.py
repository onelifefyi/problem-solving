# https://www.youtube.com/watch?v=1yUUelJsRs0&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=8

def printPattern(num):
    for i in range(num):
        x = 1
        for j in range(num*2-1):
            if(j>=num-i-1 and j<num+i):
                print(x, end='')
                if j < num-1:
                    x += 1
                else:
                    x -= 1
            else:
                print(' ', end='')
        print('\n')

printPattern(int(input()))
