# Last updated: 31/07/2025, 19:42:26
class Solution:
    def twoSum(self,nums,target):
        a=[]
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if (nums[i]+nums[j]==target):
                    a.append(i)
                    a.append(j)
                    break     
        return a