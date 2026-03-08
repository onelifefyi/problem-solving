# https://leetcode.com/problems/linked-list-cycle/

# Approach:
# Two pointer approach
# Slow, moves one at a time
# Fast, moves two at a time
# If Fast reaches the end, then no cycle
# If Fast == Slow at any point, it has cycle
# Time O(n) | Space O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        slow, fast = head, head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                return True
        return False