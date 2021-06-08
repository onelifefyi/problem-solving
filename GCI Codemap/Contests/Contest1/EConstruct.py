'''
[1] [213] [24135] [4251637]
[12] [3124] [341526] 
[213]
[3124]
[24135]
[351246]
'''
# <<NOT COMPLETE>>
def getMaxSubArray(arr):
    maxCount = 0
    ptr = len(arr)-1
    maxPos = [ptr, ptr]
    while(ptr >= 0):
        if arr[ptr] == 0:
            print(ptr, 'outside')
            count = 0
            rCtr = ptr
            while(ptr > 0):
                print(ptr, 'outside')
                if arr[ptr-1] == 0:
                    count += 1
                    ptr -= 1
            if count >= maxCount:
                maxPos = [ptr, rCtr]
        else:
            ptr -= 1
        ptr -= 1
    return maxPos
            
def fill(arr, start, end, position):
    if (end-start+1)%2 == 1:
        arr[(start+end)//2] = position
    else:
        arr[(start+end-1)//2] = position
    return arr

print(getMaxSubArray([0,0,1,0,0]))
n = int(input())
# for _ in range(n):
#     size = int(input())
#     result = [0]*size
#     position = 1
#     while 0 in result:
#         print('here', result)
#         start, end = getMaxSubArray(result)
#         result = fill(result, start, end, position)
#         position += 1
#     for num in result:
#         print(num, end=' ')