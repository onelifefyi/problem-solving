# https://leetcode.com/problems/contains-duplicate/

# Approach: Sort the list and check if neighbouring elemets are same or not.
# Time: O(nlogn) for sorting + O(n) for iteration 1x to check for duplicate
# Time: O(nlogn)

# def containsDuplicate(nums):
#     # Note that .sort() sorts the list in place, no need to store it somewhere.
    # nums.sort()
    # for index in range(len(nums) - 1):
    #     if nums[index] == nums[index + 1]:
    #         return True
    # return False

# Approach: Put all elements in a set, if already contains then duplicate
# Time: O(1) for checking duplicate + O(n) for Insertion of all elements into set
# Time: O(n)

def containsDuplicate(nums):
    nums_set = set()
    for num in nums:
        if num in nums_set:
            return True
        else:
            nums_set.add(num)
    return False

nums = [int(x) for x in input().split(' ')]
print(containsDuplicate(nums))