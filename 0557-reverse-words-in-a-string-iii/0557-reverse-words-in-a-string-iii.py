class Solution:
    def reverseWords(self, s: str) -> str:
        words= s.split()
        reversed_words = list()

        for i in words:
            reversed_words.append(i[::-1])
        
        return " ".join(reversed_words)
        