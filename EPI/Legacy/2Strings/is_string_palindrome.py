def is_string_palindrome(s):
    return all([s[i] == s[~i] for i in range(len(s)//2)])

# s = "iti"
s = "allocation"
# s = "peep"
print(is_string_palindrome(s))