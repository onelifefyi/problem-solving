# https://codeforces.com/problemset/problem/486/A

n = int(input())
k = n // 2 

first_series = (k * (2 * -1 + (k - 1) * -2)) // 2
second_series = (k * (2 * 2 + (k - 1) * 2)) // 2

total = first_series + second_series - (n if n % 2 == 1 else 0)

print(total)
