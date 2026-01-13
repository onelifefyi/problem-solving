# https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399?leftPanelTab=2

def longestSubarrayWithSumK(a: [int], k: int) -> int:
    maxLength = 0
    for i in range(len(a)):
        length = 0
        sum = 0
        for num in a[i:]:
            sum += num
            length += 1
            if sum > k:
                length -= 1
                sum -= num
                break
        if sum != k:
            length = 0
        maxLength = max(length, maxLength)
    return maxLength
