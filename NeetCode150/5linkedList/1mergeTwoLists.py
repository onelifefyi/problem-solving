# https://leetcode.com/problems/merge-two-sorted-lists/

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


# Approach:
# Brute - save it all in a hashmap, with node as value, and val as key
# Sort the hashmap based on key, and create another linked list
# Doesn't even makes sense'
# Time O(nlogn) | Space O(n)

# Better:
# Have two pointers, keep inserting whatever is smaller to a new Node
# When either linked list ends, insert the rest
# Time O(n) | Space O(1)
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        head = ListNode()
        new_list = head
        while list1 and list2:
            if list1.val < list2.val:
                new_list.next = list1
                list1 = list1.next
            else:
                new_list.next = list2
                list2 = list2.next
        if list1: new_list.next = list1
        if list2: new_list.next = list2
        return head.next
