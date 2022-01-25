# Note: Key here is that the player can rearrange (I overlooked it for a while & was getting into optimal moves aread)
# We know that if all the characters have even number of occurance then it can be a palindrome
# We know that for the string to be palindrome there can be only 1 odd number of occurance of any character
# Hence if either all even or just 1 odd then First player is winner
# Else whoever end up bringing the number of odd to <= 1 will lose
# Which means if number of char with odd occurance is even then 2nd wins & if odd then 1st wins
s = input().lower()
freqTable = [0]*26
for ch in s:
    freqTable[ord(ch)-ord('a')] += 1

oddCount = 0
for num in freqTable:
    if num%2 == 1:
        oddCount += 1

if oddCount <= 1:
    print("First")
else:
    print("First" if oddCount%2==1 else "Second")