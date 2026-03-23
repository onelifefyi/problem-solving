# https://leetcode.com/problems/meeting-rooms/
# https://neetcode.io/problems/meeting-schedule/question

# Approach:
# Brute would be to check all possible meeting combinations for conflict
# Time O(n^2) | Space O(1)

# Approach:
# I can sort this by start time
# And then keep comparing n+1st interval with nth to check for conflict
# Time O(nlogn) | Space O(1)


def canAttendMeetings(intervals) -> bool:
    intervals.sort()
    for i in range(1,len(intervals)):
        if intervals[i][0] < intervals[i-1][1]: return False
    return True

# intervals = [(0,30),(5,10),(15,20)]
intervals = [(5,8),(9,15)]
print(canAttendMeetings(intervals))