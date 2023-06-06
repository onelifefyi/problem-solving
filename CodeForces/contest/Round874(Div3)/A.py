def musicPuzz(s):
    result = set()
    for i in range (len(s) - 1):
        result.add(s[i] + s[i+1])
    # print(result)
    return len(result)

css = int(input())
for _ in range(css):
    length = input()
    s = input()
    print(musicPuzz(s))


