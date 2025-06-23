# https://leetcode.com/problems/non-overlapping-intervals/

# Approach:
# Sort the intervals by start time
# Go through intervals, if overlap, remove the one that ends later
# Time O(nlogn) | Space O(1)
def eraseOverlapIntervals(intervals):
    intervals = sorted(intervals)
    removed = 0
    prev_end = intervals[0][1]
    for start, end in intervals[1:]:
        if start < prev_end: # overlap
            removed += 1
            prev_end = min(end, prev_end)
        else: prev_end = end
    return removed


intervals = [[1,2],[2,3],[3,4],[1,3]]
print(eraseOverlapIntervals(intervals))
intervals = [[1,2],[1,2],[1,2]]
print(eraseOverlapIntervals(intervals))
intervals = [[1,2],[2,3]]
print(eraseOverlapIntervals(intervals))
