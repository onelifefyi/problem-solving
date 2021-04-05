# https://codeforces.com/problemset/problem/272/A

noFriends = int(input())

sum = 0
for num in input().split():
    sum += int(num)

count = 0
for i in range(1, 6):
    if (sum+i) % (noFriends+1) != 1:
        #print("i: ", i)
        count += 1

print(count)