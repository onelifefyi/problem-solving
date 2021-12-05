css = int(input())
for _ in range(css):
    report = [int(num) for num in input().split()]
    if min(report[0], report[1]) > max(report[2], report[3]) or min(report[2], report[3]) > max(report[0], report[1]):
        print("NO")
    else:
        print("YES")