input()
record = input()
aCount = record.count('A')
result = "Anton" if aCount > len(record)//2 else "Danik" if aCount < len(record)/2 else "Friendship"
print(result)