word = input()
up = 0
for ch in word:
    if ch.isupper():
        up += 1

word = word.upper() if up/len(word) > 0.5 else word.lower()
print(word)