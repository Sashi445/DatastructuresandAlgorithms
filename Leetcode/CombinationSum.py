class Solution:
    
    def helper(self, buffer, candidates, target):
        
        if sum(buffer) == target:
            return [buffer]
        
        elif sum(buffer) > target :
            return []
        
        else:
            
            output = []
            
            for i in candidates:
                output += self.helper(buffer + [i], candidates, target)
                
            return output
    
    
    def combinationSum(self, candidates, target):
        
        return self.helper([], candidates, target)


if __name__ == '__main__':
    s = Solution()

    result = s.combinationSum([2, 3, 5], 8)

    print(result)
