# https://leetcode.com/problems/linked-list-cycle/

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Approach:
# Simple - keep inserting the node in a set. If something already exists, the linked list has cycle
# Time O(n) | Space O(n)

# Better - two pointer approach
# Slow pointer moves one step per iteration, and the fast pointer two steps per iteration
# If at any point they both match, there's a cycle
# Time O(n) | Space O(1)

# One mistake I did was check if slow == fast first before updating, which does return true for the first element
class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast: return True
        return False