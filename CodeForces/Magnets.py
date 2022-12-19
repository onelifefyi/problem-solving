css = int(input())
lastMagnet = input()
count = 1

for _ in range(css-1):
    magnet = input()
    if magnet != lastMagnet:
        count += 1
    lastMagnet = magnet

print(count)