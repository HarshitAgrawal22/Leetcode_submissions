class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        x = num
        while x * x > num:
            x = (x + num // x) // 2
        return x * x == num
        
        