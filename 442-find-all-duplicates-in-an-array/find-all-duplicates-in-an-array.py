class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        my_set = set()

        result= list()

        for i in nums :
            if i in my_set:
                result.append(i)
            else:
                my_set.add(i)
        return result