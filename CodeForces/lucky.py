num = input()

count = 0
for ch in num:
    if ch in ['4', '7']:
        count += 1

if count in [4, 7]:
    print("YES")
else:
    print("NO")

