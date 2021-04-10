for _ in range(int(input())):
    a,b = [int(num) for num in input().split()]
    inp = input()
    arrSize = len(inp)
    arr = [ch for ch in inp]
    correct = True

    #print("current:", arr)
    # Balance
    for index, ch in enumerate(arr):
        if ch == '?':
            pass
        elif ch == '0':
            #a -= 1
            if arr[arrSize - 1 - index] == '0':
                pass
            elif arr[arrSize - 1 - index] == '1':
                correct = False
                break
            else:
                arr[arrSize - 1 - index] = '0'
                #a -= 1
        else:
            #print('b decreased for ', index)
            #b -= 1
            if arr[arrSize - 1 - index] == '1':
                pass
            elif arr[arrSize - 1 - index] == '0':
                correct = False
                break
            else:                
                arr[arrSize - 1 - index] = '1'
                #b -= 1
    a -= arr.count('0')
    b -= arr.count('1')
    if a<0 or b<0:
        print(-1)
        continue
    #print("balanced:", arr, "a:", a, 'b', b)

    if a>=0 and b>=0:
        # Check mid
        if arrSize%2 == 1:
            if(arr[arrSize//2]=='?'):
                if a%2 == 1:
                    arr[arrSize//2] = '0'
                    a -= 1
                else:
                    arr[arrSize//2] = '1'
                    b -= 1
        # Fill
        i = 0
        while(i<arrSize):
            if arr[i]=='?':
                if(a >= 2):
                    arr[i] = '0'
                    arr[arrSize-1-i] = '0'
                    a -= 2
                else:
                    arr[i] = '1'
                    arr[arrSize-1-i] = '1'
                    b -= 2
            i += 1
        #print("filled:", arr,  "a:", a, 'b', b)
        if a != 0 or b != 0:
            correct = False

    if correct:
        for ch in arr:
            print(ch, end='')
        print('')
    else:
        print(-1)

