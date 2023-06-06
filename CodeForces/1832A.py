t = int(input())

for _ in range(t):
    s = input()
    s = s[:len(s) // 2]
    unique_chars = list(set(s))
    if len(unique_chars) == 1:
        print("NO")
    else:
        print("YES")
