# https://leetcode.com/problems/merge-intervals/

# Approach:
# First, sort by start time (not sorted when provided)
# Create a res list to store the result
# For each pairs, see if they can be merged or not
# If independent, move to res
# If to be merged, make the ith interval, as merged

# Time O(nlog(n)) if not sorted, otherwise O(n) | Space O(n)
def merge(intervals):
    intervals = sorted(intervals)
    res = []
    i = 0
    while i < len(intervals) - 1:
        if intervals[i][1] < intervals[i+1][0]:
            res.append(intervals[i])
        else:
            intervals[i+1] = intervals[i][0], max(intervals[i+1][1], intervals[i][1])
        i += 1
    res.append(intervals[-1])
    return res


intervals = [[1,3],[2,6],[8,10],[15,18]]
print(merge(intervals))
intervals = [[1,4],[4,5]]
print(merge(intervals))
