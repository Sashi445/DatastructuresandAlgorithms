# Problem - 599
# https://leetcode.com/problems/minimum-index-sum-of-two-lists/

class Solution:
    
    def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:
            
            lookup = dict()  
            
            for i in range(len(list1)):
                item = list1[i]
                if item in list2 and item != " ":
                    lookup[item] = i
            
            for i in range(len(list2)):
                item = list2[i]
                if item != " " and item in lookup.keys():
                    lookup[item] += i
            
            if len(lookup.keys()) == 1:
                key, _ = lookup.popitem()
                return [key]
            
            items = sorted(lookup.items(), key=lambda item: item[1]);
            
            keys = []
            values = []
            
            for item in items:
                key, value = item
                keys.append(key)
                values.append(value)
                
            if len(set(values)) == 1:
                return keys
            
            return [keys[0]]


# class Solution:
#     def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:
#         d = {} #this dict will store the index val of all the restaurants in list1
#         for i in range(len(list1)):
#             if list1[i] not in d:
#                 d[list1[i]] = i
        
#         e = {} #this dict will only store the sum of idx of common restaurants
#         for j in range(len(list2)):
#             curr = list2[j]
#             if curr in d:
#                 e[curr] = j + d[curr]
            
#         keys = list(e.keys())
#         vals = list(e.values())
        
#         res = []
#         # running this loop to get our result
#         minval = min(vals)
#         for i in range(len(vals)):
#             if vals[i] == minval:
#                 res.append(keys[i])
#         return res
            
            
            
            
            
                    
            
                    
            
            
            
            