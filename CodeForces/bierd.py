word = input()
translated = input()
result = "YES" if word == translated[::-1] else "NO"
print(result)