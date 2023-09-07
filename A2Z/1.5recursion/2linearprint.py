def lprint(start, n):
    if start > n:
        return None
    print(start)
    lprint(start + 1, n)

lprint(1, 10)