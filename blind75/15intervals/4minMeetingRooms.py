# https://leetcode.com/problems/meeting-rooms-ii/description/

# Approach:
# Similar to last problem
# Whenever something overlaps, remove the one that ends later
# Keep doing this till removed becomes 0


# Ahh...
# The actual approach is even better
# Find out at a time what's the max number of concurrent meeting

# Ahh... again, lol
# Seperate out the start and end times (2 lists) (and sort them)
# We only care about the start time of a meeting
# And the end time of a meeting (doesn't matter which one)
# Then, iterate through the array at the same time
# If the start time is < end time increment the concurrent count
# If the end time is <= start time decrement the concurrent count
# Time O(nlogn) | Space O(n)
def minMeetingRooms(intervals):
    max_concurrent = 0
    start = sorted([start[0] for start in intervals])
    end = sorted([end[1] for end in intervals])

    i = 0
    j = 0
    concurrent = 0
    while i < len(intervals) and j < len(intervals):
        if start[i] >= end[j]: 
            j += 1
            concurrent -= 1
        else:
            i+= 1
            concurrent += 1
            max_concurrent = max(concurrent, max_concurrent)
    return max_concurrent


intervals = [(0,40),(5,10),(15,20)]
intervals = [(4,9)]
print(minMeetingRooms(intervals))