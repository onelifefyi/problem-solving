inp = input()
length, time = [int(num) for num in inp.split(' ')]

que = [ch for ch in input()]

for t in range(time):
    index = 0
    while(index < length - 1):
        if que[index] == 'B' and que[index + 1] == 'G':
            que[index] = 'G'
            que[index + 1] = 'B'
            index += 2
        else:
            index += 1

result = ''
for ch in que:
    result += ch
print(result)