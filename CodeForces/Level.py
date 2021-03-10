# https://codeforces.com/problemset/problem/469/a

max_level = int(input())
to_cross = set()

a = input().split(' ')
for item in a[1: int(a[0])+1]:
    to_cross.add(int(item))

b = input().split(' ')
for item in b[1: int(b[0])+1]:
    to_cross.add(int(item))


all_present = True
for num in range(1, max_level+1):
    if num not in to_cross:
        all_present = False 
        break

if all_present:
    print("I become the guy.")
else:
    print("Oh, my keyboard!")