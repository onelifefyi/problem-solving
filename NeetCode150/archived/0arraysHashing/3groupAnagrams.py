# https://leetcode.com/problems/group-anagrams/

# Approach:
# We can create use a dictionary, if a key doesn't exist, insert it and add it to the list
# Time O(n*mlogm) | Space O(n) 
# Where m is the word length
def groupAnagrams(strs):
    result_dict = {}
    for word in strs:
        key = tuple(sorted(word))
        if key in result_dict:
            result_dict[key].append(word)
        else:
            result_dict[key] = [word]
    return [lst for lst in result_dict.values()]


# Approach:
# So, the sorting was taking the most time, improving that
# Instead of sorting, we can use array's essentially to create the key
# Time O(n*m) | Space O(n)
def groupAnagrams(strs):
    result_dict = {}
    for word in strs:
        key = [0] * 26
        for ch in word:
            key[ord(ch) - ord('a')] += 1
        key = tuple(key)
        if key in result_dict: result_dict[key].append(word)
        else: result_dict[key] = [word]
    return list(result_dict.values())
        

strs = ["eat","tea","tan","ate","nat","bat"]
print(groupAnagrams(strs))