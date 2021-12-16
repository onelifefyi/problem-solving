import math
balance = input()
if int(balance) >= 0:
    print(balance)
elif int(balance) > -10:
    print(0)
else:
    num1 = int(balance[:-1])
    num2 = int(balance[:-2] + balance[-1])
    print(max(num1, num2))