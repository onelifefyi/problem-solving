def string_integer_conversion(x):
    result = 0
    has_sign = True if x[0] in ["-", "+"] else False
    if has_sign:
        is_negative = True if x[0] == "-" else False
        x = x[1:]
    for ch in x:
        result *= 10
        result += (ord(ch) - ord("0"))
    if has_sign:
        result = -1 * result if is_negative else result
    return result

def int_string_conversion(y):
    if y == 0:
        return "0"
    is_negative = True if y<0 else False
    y *= -1 if is_negative else 1
    result = ""
    while y:
        result += chr(y%10 + ord("0"))
        y = y//10
    if is_negative:
        result += "-"
    return result[::-1]

# x = "123"
# x = "+1"
# x = "-123"
x = "0"
print(string_integer_conversion(x))
print(type(string_integer_conversion(x)))

# y = 123
# y = -123
y = 0
print(int_string_conversion(y))
print(type(int_string_conversion(y)))