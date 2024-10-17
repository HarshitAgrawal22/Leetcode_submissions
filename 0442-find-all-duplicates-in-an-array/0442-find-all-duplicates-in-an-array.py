class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        count = dict()
        for i in nums:
            if count.get(i) == None :
                count[i] = 1
            else : count[i]+=1

        final_list =list()
        for i in count.keys():
            if count[i] != 1 :
                final_list.append(i)
        return final_list 