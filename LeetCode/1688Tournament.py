# https://leetcode.com/problems/count-of-matches-in-tournament/
def numberOfMatches(n):
    count = 0
    while(n>1):
        if n%2 == 0:
            n = n//2
            count += n
            #print('even: ', n)
        else:
            n = n//2 + 1
            count += n - 1
            #print('odd: ', n-1)
    return count

print(numberOfMatches(int(input())))