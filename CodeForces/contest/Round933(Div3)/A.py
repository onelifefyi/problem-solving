css = int(input())
for _ in range(css):
    m, n, k = [int(x) for x in input().split(" ")]
    left = sorted([int(x) for x in input().split(" ")])
    right = sorted([int(x) for x in input().split(" ")])
    count = 0
    for a in left:
        if a > k: break
        for b in right:
            if b > k: break
            if a + b <= k: count += 1
    print( count)