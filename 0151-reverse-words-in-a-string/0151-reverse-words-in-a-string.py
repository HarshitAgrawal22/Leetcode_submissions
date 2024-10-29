class Solution:
    def reverseWords(self, s: str) -> str:
        li = list()
        for i in s.split():
            li.append(i)
        
        stri = ""
        for i in li[::-1]:
            stri += i + " "
        stri = stri.strip()
        return stri