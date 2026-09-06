# https://neetcode.io/problems/meeting-schedule/history?list=neetcode150&submissionIndex=8
# https://leetcode.com/problems/meeting-rooms/description/

# Approach
# I can sort it by start time first O(nlogn)
# Then iterate over the whole list, if there's overlap, return False
# At the end return True

# Time O(nlogn) | Aux Space O(1)
def canAttendMeetings(intervals):
    intervals.sort(key = lambda meeting: meeting[0])
    maxEnd = intervals[0][1]
    for meeting in intervals[1:]:
        if meeting[0] < maxEnd: return False
        maxEnd = meeting[1]
    return True

intervals = [(15, 20),(0,30),(5,10)]
print(canAttendMeetings(intervals))
