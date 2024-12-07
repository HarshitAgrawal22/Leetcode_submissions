class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        
        def quicksort(n):
            if len(n) <= 1:
                return n
        
            left, middle, right = [],[],[]
            pivot = random.choice(n)

            for i in n:
                if i == pivot:
                    middle.append(i)
                elif i < pivot:
                    left.append(i)
                else:
                    right.append(i)
            
            return quicksort(left) + middle + quicksort(right)
        

        return quicksort(nums)