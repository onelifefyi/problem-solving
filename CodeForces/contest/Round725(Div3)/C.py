# https://codeforces.com/contest/1538/problem/C

#<<NOT SOLVED>>

css = int(input())
for zz in range(css):
    n, l, r = [int(num) for num in input().split(' ')]
    arr = [int(num) for num in input().split(' ')]
    arr.sort()
    lBound = 0
    rBound = n-1
    total = 0
    #print(arr)
    while lBound<rBound and arr[lBound]<r:
        tempL = lBound+1
        while arr[lBound]+arr[rBound]>r and lBound<rBound:
            rBound -= 1
        while arr[lBound] + arr[tempL]<l and tempL<rBound:
            tempL += 1
        total += rBound-tempL+1
        print(f'lBound {lBound} rBound {rBound}')
        lBound += 1
    print('res',total)
