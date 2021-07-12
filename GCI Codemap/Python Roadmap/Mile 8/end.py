def getResult(word):
    if len(word) <= 3:
        return word
    elif word[-3:] == 'ing':
        return word + 'ily'
    else:
        return word + 'ing'

word = input()
print(getResult(word))