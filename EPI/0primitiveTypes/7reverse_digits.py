# Approach:
# Classic, keep dividing and storing the remainder
# Time O(x), where x is the # digits of the number
# Space O(1)

def reverse(x: int) -> int:
    result, remaining = 0, abs(x)
    while remaining:
        result = (result * 10) + (remaining % 10)
        remaining = remaining // 10
    return result if x >= 0 else result * -1

x = -123
print(reverse(x))