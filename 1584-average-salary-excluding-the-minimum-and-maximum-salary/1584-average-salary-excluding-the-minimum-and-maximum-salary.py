class Solution:
    def average(self, salary: List[int]) -> float:
        
        total = sum(salary)
        total =total  - max(salary) - min(salary)

        return total / (len(salary) -2)