class Solution:
    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        
        words=sentence.split()
        count=1
        for i in words:
            if searchWord in i[:len(searchWord)]:

                return count
            else:
                count+=1
        return -1