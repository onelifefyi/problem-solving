# https://leetcode.com/problems/height-checker/

# Time O(nlogn)
# def heightChecker(heights):
#     sortedHeight = sorted(heights)
#     count = 0
#     for index, value in enumerate(heights):
#         if value != sortedHeight[index]:
#             count += 1
#     return count

# print(heightChecker([1,1,4,2,1,3]))

# Since there is constraint that the numbers will be between 1 and 100, we can improve complexity

# Time O(n)
def heightChecker(heights):
    freq = [0] * 101
    for value in heights:
        freq[value] += 1
    ptr = 0
    count = 0
    for index in range(101):
        while(freq[index] > 0):
            if heights[ptr] != index:
                count += 1
            freq[index] -= 1
            ptr += 1
    return count


print(heightChecker([1,1,4,2,1,3]))
print(heightChecker([5,1,2,3,4]))