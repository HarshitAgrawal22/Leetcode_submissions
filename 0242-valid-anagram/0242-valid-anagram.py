class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!= len(t):
            return False
        else:
            s_dict= Counter(s)
            t_dict=Counter(t)
        return s_dict==t_dict