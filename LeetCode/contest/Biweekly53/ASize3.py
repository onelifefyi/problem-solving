def countGoodSubstrings(s):
    count = 0
    for i in range(0, len(s)-2):
        if(s[i:i+3][0] != s[i:i+3][1] and s[i:i+3][1] != s[i:i+3][2] and s[i:i+3][0] != s[i:i+3][2]):
            count += 1
    return count

print(countGoodSubstrings(input()))