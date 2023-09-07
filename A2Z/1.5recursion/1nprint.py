def nprint(n, name):
    if n == 0:
        return None
    print(name)
    nprint(n-1, name)

n = int(input())
name = "test"
nprint(n, name)