class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
       return (self.gridTraveler(m, n ,dict()))
    def gridTraveler(self, m , n , memo:dict):
        key = str(m)+","+str(n)

        if key in memo: return memo[key]
        if m==1 and n==1 : return 1
        if m==0 or n==0: return 0
        memo[key] = self.gridTraveler(m-1, n, memo)+ self.gridTraveler(m , n-1, memo)
        return memo[key] 