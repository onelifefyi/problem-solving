# EPI page 32

# In python it's straight forward, take string and reverse it

# Another traditional approach is to keep on modding by 10 to get reminder,
# multiply it by 10 and keep on adding
# Need to add check for -ve or +ve
# Time O(n) where n is number of digits
# Space O(1)
def reverse_digits(num):
    result = 0
    is_neg = True if num<0 else False
    num = num * -1 if is_neg else num
    reminder = 0
    while num != 0:
        reminder = num%10
        result *= 10
        result += reminder
        num = num//10
    return result * -1 if is_neg else result

num = int(input())
print(reverse_digits(num))