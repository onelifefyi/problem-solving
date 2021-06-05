# https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/

def isSumEqual(firstWord, secondWord, targetWord):
    def getValue(word):
        num = 0
        i = 1
        for ch in word[::-1]:
            num += (ord(ch) - ord('a'))*i
            i *= 10
        return num
    return True if getValue(firstWord)+getValue(secondWord)==getValue(targetWord) else False

print(isSumEqual('acb', 'cba', 'cdb'))