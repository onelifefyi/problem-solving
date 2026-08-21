# https://leetcode.com/problems/meeting-rooms/


# Approach:
# Sort the list based on first sublist element (start time)
# Then go on with the list and see if there's any intersection
# Time O(nlogn) | Space O(1)
def canAttendMeetings(intervals):
    intervals.sort()
    i = 0
    while i < len(intervals) - 1:
        if intervals[i][1] > intervals[i+1][0]: return False
        i += 1
    return True

# intervals = [(5,8),(9,15)]
intervals = [(0,30),(5,10),(15,20)]
print(canAttendMeetings(intervals))