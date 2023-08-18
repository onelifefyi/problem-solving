css = int(input())
for _ in range(css):
    word = ""
    for line in range(8):
        word += input().replace(".", "")
    print(word)