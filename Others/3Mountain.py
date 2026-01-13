# Tutorial: https://tcsglobal.udemy.com/course/cpp-data-structures-algorithms-levelup-prateek-narang/learn/lecture/24429144?start=15#content
# Similar: https://leetcode.com/problems/longest-mountain-in-array/

# Returning max
def longestMountain(arr):
    ptr = 1
    max_count = 0
    while(ptr<len(arr) - 1):
        count = 1
        if arr[ptr-1]<arr[ptr] and arr[ptr+1]<arr[ptr]:
            left = ptr
            while(left>0 and arr[left-1]<arr[left]):
                count += 1
                left -= 1
            right = ptr
            while(right<len(arr)-1 and arr[right+1]<arr[right]):
                count += 1
                right += 1
            max_count = max(max_count, count)
        ptr += 1
    return max_count


arr = [int(num) for num in input().split(' ')]
print(longestMountain(arr))