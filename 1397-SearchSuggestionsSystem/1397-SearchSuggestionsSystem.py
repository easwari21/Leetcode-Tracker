# Last updated: 8/19/2026, 10:37:18 AM
class Solution:
    def suggestedProducts(self, products: List[str], searchWord: str) -> List[List[str]]:
        products.sort()
        res = []
        prefix = ""
        for i in searchWord:
            prefix += i
            a = []
            for j in products:
                if j.startswith(prefix):
                    a.append(j)
                if len(a) == 3:   
                    break
            res.append(a)
        
        return res
