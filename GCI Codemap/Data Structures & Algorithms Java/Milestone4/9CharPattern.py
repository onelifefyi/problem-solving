# https://www.youtube.com/watch?v=nEvDsMud17M&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=9

def printPattern(num):
    for row in range(num):
        start = ord('A')
        for col in range(num+num-1):
            if col<=num-1-row or col>=num-1+row:
                print(chr(start), end='')
            else:
                print(' ', end='')
            start = (start + 1) if col<num-1 else (start-1)
        print('\n')

printPattern(int(input()))

'''
ABCDCBA
ABC CBA
AB   BA
A     A

row coll
0 0123456
1 012 456
2 01   56
3 0     6
'''