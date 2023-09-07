def oprint(n, start):
    if start > n:
        return None
    print(n)
    oprint(n-1, start)

oprint(5, 1)