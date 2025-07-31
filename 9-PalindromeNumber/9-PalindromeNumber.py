# Last updated: 31/07/2025, 19:42:19
class Solution(object):
    def isPalindrome(self, x):
        return str(x) == str(x)[::-1] and x >= 0

        