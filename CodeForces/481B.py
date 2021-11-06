num = int(input())
text = input()
x_count = 0
to_remove = 0
for ch in text:
    if ch == 'x':
        x_count += 1
        if x_count > 2:
            to_remove += 1
    else:
        x_count = 0
print(to_remove)