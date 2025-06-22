# https://leetcode.com/problems/insert-interval/

# Approach:
# Just create a new array and keep inserting based on position
# Not that complex
# Time O(n) | Space O(n)

def insert(intervals, newInterval):
    res = []
    for i in range(len(intervals)):
        if newInterval[1] < intervals[i][0]:
            res.append(newInterval)
            res = res + intervals[i:]
            return res
        if newInterval[0] > intervals[i][1]:
            res.append(intervals[i])
        else:
            newInterval = [min(intervals[i][0], newInterval[0]), max(intervals[i][1], newInterval[1])]

    res.append(newInterval)
    return res
            


intervals = [[1,3],[6,9]]
newInterval = [2,5]
print(insert(intervals, newInterval))
intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]]
newInterval = [4,8]
print(insert(intervals, newInterval))
