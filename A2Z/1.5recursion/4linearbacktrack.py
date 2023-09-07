def lbacktrack(i, n):
    if i < 1:
        return None
    lbacktrack(i-1, n)
    print(i)

lbacktrack(10, 10)