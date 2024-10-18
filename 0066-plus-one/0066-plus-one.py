class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        data = ""
        for i in digits:
        
           data+=str(i) 
        
        data =list(str( int(data)+1))

        data=[int(i) for i in data]
        return data