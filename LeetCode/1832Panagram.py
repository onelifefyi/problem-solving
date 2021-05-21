# https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/

# Not the most efficient (constant extra space and 2 pass)
# Time O(N) | space O(1)
# def checkIfPangram(sentence):
#     freqTable = [False]*26
#     for ch in sentence:
#         freqTable[ord('a' ) - ord(ch)] = True
        
#     for alp in freqTable:
#         if alp==False:
#             return False
#     return True

# Better
def checkIfPangram(sentence):
    return True if len(set(sentence)) == 26 else False

print(checkIfPangram(input()))