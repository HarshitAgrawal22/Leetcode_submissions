class Solution:
    def sort(self, nums):
        if len(nums)<=1:
            return nums
        else:
            pivot= nums[0]
            left = [i for i in nums[1:] if i < pivot]
            right = [i for i in nums[1:] if i >= pivot]
            return self.sort(left)+[pivot] + self.sort(right)

    def sortedSquares(self, nums: List[int]) -> List[int]:
        squared_nums = list()
        for i in nums: squared_nums.append(i*i)


        return self.sort(squared_nums)