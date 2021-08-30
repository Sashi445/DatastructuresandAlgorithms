# Problem - 929
# https://leetcode.com/problems/unique-email-addresses/

class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
    
        mailmap = dict()
        
        for email in emails:
            localname, domainname = tuple(email.split('@'))
            localname = localname.split('+')[0].replace('.', '')
            # localname = "".join(localname.split('.')) 
            mailmap[localname+ '@' +domainname] = 1
        
        return len(mailmap.keys())
            
            