# https://leetcode.com/problems/merge-two-sorted-lists/description/

# Approach:
# Create a new linked list and keep inserting the smallest element

# Better:
# Keep connecting
# Have two pointers, and swapping the next to smallest element
# Time O(n+m) | Space O(1)

def mergeTwoLists(list1, list2):
    if not list1: return list2
    if not list2: return list1

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
