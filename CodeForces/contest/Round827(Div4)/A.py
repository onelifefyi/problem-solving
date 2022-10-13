css = int(input())

for _ in range(css):
    inp = [int(num) for num in input().split()]
    inp.sort()
    result = "NO"
    if inp[2] == inp[0] + inp[1]:
        result = "YES"
    print(result)