# problem: https://practice.geeksforgeeks.org/problems/armstrong-numbers/0
num = input("Enter a number: ")
sum = 0
for str in num:
    sum += int(str)**len(num)

print(sum)
if sum == int(num): print("It's Armstrong")
else: print("Not Armstrong")