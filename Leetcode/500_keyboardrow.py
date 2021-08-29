# Problem link
# https://leetcode.com/problems/keyboard-row/
# Problem Number - 500

# MySolution

class Solution:
    def findRow(self, keyboard: List[str], word: str) -> int:    
        for i in range(len(keyboard)):
            row = keyboard[i]
            letter = word[0]
            if letter in row:
                return i
        return -1
                
    def checkLookup(self, lookup: List[str], row: List[str], letter: str) -> bool:
            if letter.lower() in lookup:
                return True
            elif letter in row:
                lookup.append(letter.lower())
                return True
            else:
                return False
    
    def findWords(self, words: List[str]) -> List[str]:
        keyboard = [
            "qwertyuiopQWERTYUIOP",
            "asdfghjklASDFGHJKL",
            "zxcvbnmZXCVBNM",
        ]
        result = list()
        for word in words:
            row = keyboard[self.findRow(keyboard, word)]
            print(row)
            lookup = list()
            flag = True
            for letter in word:
                res = self.checkLookup(lookup, row, letter)
                if not res:
                    flag = False
                    break
            if flag:
                result.append(word)
            
        return result
            
# Efficient or Best solutions:

# class Solution:
#     def findWords(self, words: List[str]) -> List[str]:
        
#         # Time: O(n), Space: O(1) (Except for answer)
        
#         keyMap = {}
#         for key in "qwertyuiopQWERTYUIOP":
#             keyMap[key] = 0
#         for key in "asdfghjklASDFGHJKL":
#             keyMap[key] = 1
#         for key in "zxcvbnmZXCVBNM":
#             keyMap[key] = 2
            
#         ans = []
#         for word in words:
#             rowNum = keyMap[word[0]]
#             for char in word:
#                 if keyMap[char] != rowNum:
#                     break
#             else:
#                 ans.append(word)
                
#         return ans     