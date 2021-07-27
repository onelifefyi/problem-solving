# https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
# Above problem modded to return the start and end index

# Approach: Sort the entire array and then compare sorted and unsorted array to find first and last different position
# Time O(nlogn) | Aux space O(n)
def findUnsortedSubarray(arr):
    sortedArr = sorted(arr)
    first_match = -1
    last_match = -1
    