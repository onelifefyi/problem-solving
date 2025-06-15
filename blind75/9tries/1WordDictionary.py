# Everything similar to implementing Trie
# New thing is search with wild character
# We can use backtracking using recursion
# So, each time a wild char appears, we 
# iterate through all the childrens of the node
# and, jump to the next char
# If, the word is found, we return True 
# If, word is not found across all child, return False
# The other process remains the same

class TrieNode:

    def __init__(self):
        self.children = {}
        self.endOfWord = False

class WordDictionary:
    
    def __init__(self):
        self.root = TrieNode()
            
    def addWord(self, word: str) -> None:
        curr = self.root

        for index, ch in enumerate(word):
            if ch not in curr.children:
                curr.children[ch] = TrieNode()
            curr = curr.children[ch]
        curr.endOfWord = True
        return 0


    def search(self, word: str) -> bool:
        
        def dfs(j, root):
            curr = root
            for i in range(j, len(word)):
                ch = word[i]

                if ch == ".":
                    for child in curr.children.values():
                        if dfs(i+1, child): return True
                    return False

                else:
                    if ch not in curr.children: return False
                    curr = curr.children[ch]
            return curr.endOfWord

        return dfs(0, self.root)
