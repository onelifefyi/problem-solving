# https://www.youtube.com/watch?v=JWMKN7OW_SA&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=6

# def printPattern(num):
#     for i in range(num):
#         for j in range(num*2-1):
#             if j >=num-1-i and j <= num-1+i:
#                 if(i%2==0):
#                     if(j%2==0):
#                         print('*',end='')
#                     else:
#                         print(' ',end='')
#                 else:
#                     if(j%2==1):
#                         print('*',end='')
#                     else:
#                         print(' ',end='')
#             else:
#                 print(' ',end='')
#         print('\n')

def printPattern(num):
    for i in range(num):
        toggle = True
        for j in range(num*2-1):
            if j >=num-1-i and j <= num-1+i and toggle:
                print('*', end='')
                toggle = False
            else:
                print(' ',end='')
                toggle = True
        print('\n')

printPattern(int(input()))

'''
````*
```* *
``* * *
`* * * *
* * * * * 
max i=4; j=7
i=1 j=4
i=2 j=3,5
i=3 j=2,4,6
i=4 j=1,3,5,7
'''