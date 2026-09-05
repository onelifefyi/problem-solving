# https://leetcode.com/problems/linked-list-cycle/description/

# Approach:
# Keep inserting in a set, if ends, then no cycle, if repeats from set, then cycle
# Time O(n) | Space O(n)

# Better:
# Have slow and fast pointer, slow moves once per iteration, fast twice per iteration,
# If they ever collide, then cycle, if reaches the end then no cycle
# Time O(n) | Space O(1)
def hasCycle(head):
    slow, fast = head, head
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            return True
    return False

