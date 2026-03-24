# https://leetcode.com/problems/group-anagrams/description/

# Approach:
# Brute, compare all the words with each other, group them together
# Time O(really bad, lol)

#... let me just solve it, then will think of optimal approach
# def isAnagram(s1, s2):
#     if len(s1) != len(s2): return False
#     freq = dict()
#     for i in range(len(s1)):
#         freq[s1[i]] = freq.get(s1[i], 0) + 1
#         freq[s2[i]] = freq.get(s2[i], 0) - 1
#     for ch in freq:
#         if freq[ch] != 0: return False
#     return True

# def groupAnagrams(strs):
#     visited = [False] * len(strs)
#     res = []
#     for i in range(len(strs)):
#         if not visited[i]:
#             visited[i] = True
#             anagram = [strs[i]]
#             for j in range(i+1, len(strs)):
#                 if isAnagram(strs[i], strs[j]):
#                     visited[j] = True
#                     anagram.append(strs[j])
#             res.append(anagram)
#     return res


# Approach: One hot encoding like approach
# Represent each word as tuple containing 26 english caracters in order, keep putting it in a list
# Store each unique in hashmap, tuple as key, word as value (in a list)
# Return the list of all values
# Time O(n*m) where m is length of word | Space O(n*m) 26 characters O(1) + O(n) for all the words

from collections import defaultdict
def groupAnagrams(strs):
    wordDict = defaultdict(list) # so the dict has default values as empty list
    for word in strs:
        freq = [0] * 26
        for ch in word:
            freq[ord(ch) - ord('a')] += 1
        freq = tuple(freq)
        wordDict[freq].append(word)
    return list(wordDict.values())



strs = ["eat","tea","tan","ate","nat","bat"]
print(groupAnagrams(strs))