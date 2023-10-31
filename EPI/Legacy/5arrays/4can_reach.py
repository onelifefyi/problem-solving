# EPI page 44

# Approach | In this game, the array at index i represent the "max" number of
# steps we can take from that index. So, that includes everything that we encounter
# when taking the steps
# We've to maximise the total steps, till we reach last index

# Time O(n) | space O(1)
def can_reach(arr):
    ptr = 0
    max_range = 0
    last_index = len(arr) - 1
    while ptr <= max_range and max_range < last_index:
        curr_range = ptr + arr[ptr]
        max_range = max(curr_range, max_range)
        ptr += 1
    return max_range >= last_index

arr = [int(num) for num in input().split()]
print(can_reach(arr))