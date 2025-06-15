# Very interesting implementation
# Great for word search
# One key thing to remember is the end of word
# Each time a word is inserted, mark the boolean as True (False by default) to signify that a word is complete

class TrieNode:

    def __init__(self):
        self.children = {}
        self.endOfWord = False

class Trie:
    
    def __init__(self):
        self.root = TrieNode()
            
    def insert(self, word: str) -> None:
        curr = self.root

        for index, ch in enumerate(word):
            if ch not in curr.children:
                curr.children[ch] = TrieNode()
            curr = curr.children[ch]
        curr.endOfWord = True
        return 0


    def search(self, word: str) -> bool:
        curr = self.root
        for ch in word:
            if ch not in curr.children: return False
            curr = curr.children[ch]
        return curr.endOfWord
            

    def startsWith(self, prefix: str) -> bool:
        curr = self.root
        for ch in prefix:
            if ch not in curr.children: return False
            curr = curr.children[ch]
        return True

