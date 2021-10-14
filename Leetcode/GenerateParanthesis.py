class Solution:
    
    def is_valid(self, parantheses):
        
        stack = list()
        
        for char in parantheses:
            if char in ["("]:
                # Push the element in the stack
                stack.append(char)
            else:

                # IF current character is not opening
                # bracket, then it must be closing.
                # So stack cannot be empty at this point.
                if not stack:
                    return False
                
                current_char = stack.pop()
                
                if current_char == '(' and char != ")" :
                    return False
 
        # Check Empty Stack
        if stack:
            return False
        return True

    
    # def helper(self, n, buffer, output):

    #     if n == 0:
    #         if self.is_valid(buffer):
    #             output.append(buffer)
    #         return

    #     for brace in [ "(" , ")" ]:
    #         self.helper( n-1, buffer + brace, output)

    def helper(self, n, buffer):
        if n == 0:
            if self.is_valid(buffer):
                return [buffer]
            return []
        else:
            output = []
            for brace in ["(", ")"]:
                output += self.helper(n - 1, buffer + brace)
            return output
    
    def generateParenthesis(self, n):
        # results = []
        return self.helper(2*n, "")
        # return results
        


if __name__ == "__main__":

    s = Solution()

    result = s.generateParenthesis(2)

    print(result)