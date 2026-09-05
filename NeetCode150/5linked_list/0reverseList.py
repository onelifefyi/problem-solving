# https://leetcode.com/problems/reverse-linked-list/

# Approach:
# for each node, first, store the current node in temp
# move curr to curr.next
# make temp.next to prev
# set prev to temp
# Time O(n) | Space O(1)

def reverseList(head):
    prev = None
    curr = head

    while curr:
        temp = curr
        curr = curr.next
        temp.next = prev
        prev = temp
    return prev
