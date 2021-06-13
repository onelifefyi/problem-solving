# Brute: TLE
# css = int(input())
# for zz in range(css):
#     D, d, P, Q = [int(num) for num in input().split(' ')]
#     total = 0
#     for day in range(D):
#         total += P + Q*(day//d)
#     print(total)

# A bit optimised <<STILL TLE>>
css = int(input())
for zz in range(css):
    D, d, P, Q = [int(num) for num in input().split(' ')]
    total = 0
    for stretch in range(D//d):
        total += d*(P + Q*stretch)
    total += (P + Q*(D//d))*(D%d)
    print(total)