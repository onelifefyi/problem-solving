cost, wallet, nos = [int(num) for num in input().split()]

print(int((cost*nos*(nos+1)/2)-wallet))