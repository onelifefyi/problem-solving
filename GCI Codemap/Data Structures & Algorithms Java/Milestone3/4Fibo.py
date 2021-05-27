# https://codeforwin.org/2015/06/fibonacci-series-in-c-program.html

def getFibo(num):
    first, second = 0, 1
    if num >= 0:
        print(0, end=' ')
    if num > 1:
        print(1, end = ' ')
    if num > 2:
        position = 3
        while(position <= num):
            new = first+second
            print(new, end=' ')
            first = second
            second = new
            position += 1

getFibo(int(input()))