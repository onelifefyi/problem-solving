def count_bits(n):
    result = []
    for i in range(n+1):
        result.append(bin(i).count('1'))
    return result

n = int(input())
print(count_bits(n))