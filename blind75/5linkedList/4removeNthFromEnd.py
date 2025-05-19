# https://leetcode.com/problems/remove-nth-node-from-end-of-list/

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


# Approach:
# Simple - two pass
# First pass to get the length of the linked list
# Second pass to get to length - n node, and remove it
# Time O(m) | Space O(1)

# Better Approach:
# Single pass
# We can have two pointers. One standard and one delayed. The delayed one starts after n skips, and finally, we remove when the std pointer reaches the end.
# Time O(m) | Space O(1)
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(next = head)
        delayed_ptr, ptr = dummy, dummy
        while ptr.next:
            if n <= 0:
                delayed_ptr = delayed_ptr.next
            ptr = ptr.next
            n -= 1
        delayed_ptr.next = delayed_ptr.next.next
        return dummy.next
