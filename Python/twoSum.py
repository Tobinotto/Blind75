"""
twoSum: a program that takes an list
of integers and a target integer
and returns the indices of the two numbers
in the list that sum to the target
"""

class Solution:
    def twoSum(self, nums, target):
        # returns a list of indices of in nums that sum to target 

        indices = []

        # finding indices of nums that sum to target
        for i in range(len(nums) - 1):
            search_val = target - nums[i]
            for j in range(i+1, len(nums)):
                if nums[j] == search_val:
                    indices.append(i)
                    indices.append(j)

        return indices
    
    def quickTwoSum(self, nums, target):
        # a twoSum version that is < O(n^2) time complexity

        indices = []

        for i in range(len(nums)-1):
            s_val = target - nums[i]
            # non-iterative way of finding s_val

        return indices

if __name__ == '__main__':
    # gets nums list and targert from user

    list = []

    n = int(input('Enter a number of elements: '))
    for i in range(0, n):
        elem = int(input())

        list.append(elem)

    target = int(input('Enter a target sum: '))
    indices = Solution().twoSum(list, target)
    print(indices)






