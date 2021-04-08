# https://codeforces.com/problemset/problem/320/A

# Couldn't solve this problem:
# num = [int(num) for num in input()]
# incorrect = False
# if num[0] == 4 or num[-1] not in [1,4]:
#     print("NO")
# else:
#     i = 1
#     while(i<len(num)-1):
#         if(num[i] not in [1,4]):
#             print("NO")
#             incorrect = True
#             break
#         else:
#             if(num[i]==4):
#                 if(num[i-1] != 1 or num[i+1] != 1):
#                     print("NO")
#                     incorrect = True
#                     break
#         i += 1
#     if not incorrect:
#         print("YES")

# Help from editorial:
# Time O(n) | Aux space O(1)
magical = True
num = input()
for ch in num:
    if ch not in ['1','4']:
        magical = False
        break
if(not magical or num[0] != '1' or '444' in num):
    print("NO")
else:
    print("YES")

