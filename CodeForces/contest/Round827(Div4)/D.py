# NOT SOLVED YET

# x and y are coprime if their GCD is 1
def coprime(x,y):
    # finding GCD
    while y != 0:
        x, y = y, x%y
    # x contains GCD
    return x == 1

css = int(input())

for _ in range(css):