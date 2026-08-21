# https://leetcode.com/problems/top-k-frequent-elements/description/

# Approach:
# Calculate the frequency of every element
# Sort it by frequency, return the k most frequent
# Time O(nlogn) | Space O(n)


# Approach:
# Same as above, but instead of sorting. Use an array to store for each value
# Now simply return the top k from the end
# Time O(n) | Space O(n)
def topKFrequent(nums, k):
    freq_dict = {}
    for num in nums:
        if num in freq_dict: freq_dict[num] += 1
        else: freq_dict[num] = 1
    
    freq_list = [0] * (len(nums) + 1)
    for key, value in freq_dict.items():
        if freq_list[value] == 0: freq_list[value] = [key]
        else: freq_list[value].append(key)
        
    result = []
    i = -1
    while True:
        if freq_list[i]:
            for num in freq_list[i]:
                result.append(num)
                if len(result) == k: return result
        i -= 1




nums = [1,1,1,2,2,3]
k = 2
# nums = [1]
# k = 1
print(topKFrequent(nums, k))