"""
validPalindrome: varifies whether a string, s, is a palindrome or not. Returns
True if is, and False if it is not.
"""


class Solution():
    def isPalindrome(self, s):
        s = s.lower()

        # getting rid of non alphanumeric characters
        s2 = ""
        for ch in s:
            if ch in range(48,57) or ch in range(97, 122):
                s2 += ch

        for i in range(len(s2)):
            if s2[i] != s2[len(s2) - i]:
                return False
            
        return True

def main():
    s = "A man, a plan, a canal: Panama"
    mySolution = Solution()
    mySolution.isPalindrome(s)


if __name__ == '__name__':
    main()





    