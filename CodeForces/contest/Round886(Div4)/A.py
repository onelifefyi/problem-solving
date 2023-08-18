css = int(input())

for _ in range(css):
    nums = sorted([int(n) for n in input().split()])
    result = "YES" if nums[-1] + nums[-2] >= 10 else "NO"
    print(result)