class Solution:
    def numSteps(self, s: str) -> int:
        
        num:int=0
        count=0
        s=s[::-1]
        for i in s :
            num+= int(i)*(2**count)
            count+=1
        print(num)

        second_count=0

        while num!=1:
            if num%2==0:num=num//2

            else:num+=1
            print(num)
            second_count+=1
        return second_count

