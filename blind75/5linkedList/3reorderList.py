# https://leetcode.com/problems/reorder-list/

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

# Approach:
# Have two pointers, slow and fast
# The idea is to move fast pointer two steps per iteration and the slow pointer one step.
# When the fast pointer reaches the end, slow will be at the mid point.
# Now, can start merging, starting from head, alternating between slow
# Ah!!! Didn't read the problem statement carefully, this won't work, solving the wrong question.

# Approach:
# While still using slow and fast pointer
# After half is reached, reverse the remaining part of the linked list
# Finally, keep alternating
class Solution:
    def reorderList(self, head):
        """
        Do not return anything, modify head in-place instead.
        """
        result = ListNode()
        slow, fast = head, head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
        
        prev = slow
        curr = slow.next
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        curr = prev
        