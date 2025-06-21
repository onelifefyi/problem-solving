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
        slow, fast = head, head.next
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        # Reverse the 2nd half
        second = slow.next
        slow.next = None
        prev = None

        while second:
            tmp = second.next
            second.next = prev
            prev = second
            second = tmp

        # Merge
        first, second = head, prev
        while second:
            tmp1, tmp2 = first.next, second.next
            first.next = second
            second.next = tmp1
            first = tmp1
            second = tmp2

