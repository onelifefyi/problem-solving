# https://leetcode.com/problems/merge-two-sorted-lists/

# Approach:
# Kinda simple, using variable reassignments, keep inserting the smaller one first
# If one LL ends, attatch the other at the end
# Time O(min(n, m)) | Space O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        curr = dummy
        while list1 and list2:
            if list1.val < list2.val:
                curr.next = list1
                list1 = list1.next
            else:
                curr.next = list2
                list2 = list2.next
            curr = curr.next
        if list1: curr.next = list1
        if list2: curr.next = list2
        return dummy.next
