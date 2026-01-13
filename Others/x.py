# int arr[] = {3,4,6,1,2};
# //o/p = [48, 36, 24, 144, 72]

def prodExcept(arr):
    result = [1] * len(arr)
    before = 1

    n = len(arr)
    for i in range(n):
        resul



arr = [int(x) for x in input().split()]
print(prodExcept(arr))