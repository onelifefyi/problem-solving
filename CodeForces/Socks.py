initial, freq = [int(num) for num in input().split()]
remaining = initial

days = 0
while remaining >= freq:
    days += remaining - (remaining%freq)
    remaining = (remaining%freq) + remaining//freq

days += remaining
print(days)