# https://codeforces.com/problemset/problem/199/A

# The one below is quite good, but it turns out that we can also divide the virus by zero
# So the divisible by zero solution is after commented block below:

# Time O(n) | aux space O(1)
# n = int(input())
# if n < 3:
#     print("I'm too stupid to solve this problem")
# elif n == 3:
#     print(1, 1, 1)
# else:
#     fibo = [0, 1, 1, 2, 3]
#     while(fibo[-1] < n):
#         fibo.append(fibo[-1] + fibo[-2])
#         fibo.pop(0)
#     print(fibo[0], fibo[1], fibo[3])

# I feel sooo stupid after this!!!
# Time O(1) | Aux Space O(1)
n = int(input())
print(0, 0, n)