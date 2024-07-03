class Solution:
    
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        zeros_count, ones, n = 0, 0, len(nums)
        for num in nums:
            if num == 0:
                zeros_count += 1
            elif num == 1:
                ones += 1

        for i in range(0, zeros_count):
            nums[i] = 0

        for i in range(zeros_count, zeros_count + ones):
            nums[i] = 1

        for i in range(zeros_count + ones, n):
            nums[i] = 2
    
        