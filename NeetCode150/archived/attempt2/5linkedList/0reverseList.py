# https://leetcode.com/problems/reverse-linked-list/

# Approach
# Brute: Go through each node, storing in a stack
# Build the Linked List by poping till empty
# Time O(n) | Space O(n)

# Better
# Each time, keep swapping the nodes
# Time O(n) | Space O(1)

# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while curr:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev