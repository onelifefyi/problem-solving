def lbacktrack(i, n):
    if i > n:
        return None
    lbacktrack(i+1, n)
    print(i)

lbacktrack(1, 10)