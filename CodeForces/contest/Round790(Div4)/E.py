# https://codeforces.com/contest/1676/problem/E

css = int(input())
for _ in range(css):
    n, q = [int(num) for num in input().split(' ')]
    sugarCount = [int(num) for num in input().split(' ')]
    maxPossible = sum(sugarCount)
    for test in range(q):
        required = int(input())
        if required > maxPossible:
            print(-1)
        elif required == maxPossible:
            print(n)
        else:
            sugarCount.sort()
            count = 0
            sugarLvl = 0
            # Instead of linearly adding, perhaps I can create sum till now list and 
            # do a binary search till that point.. to decrease time taken
            while(sugarLvl < required):
                count += 1
                sugarLvl += sugarCount[count*-1]
            print(count)