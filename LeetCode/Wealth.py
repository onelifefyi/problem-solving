def getWealth(accounts):
    maxSum = 0
    for customer in accounts:
        sum = 0
        for num in customer:   
            sum += int(num)
        maxSum = max(sum, maxSum)
    return maxSum


n = int(input())
total = []
temp = []
for pAccounts in range(n):
    temp = input().split(' ')
    total.append(temp)

print(getWealth(total))