def decode(encoded, first):
    result = [first]
    for index, num in enumerate(encoded):
        result.append(result[-1]^encoded[index])
    return result

first = int(input())
encoded = [int(num) for num in input().split()]
print(decode(encoded, first))