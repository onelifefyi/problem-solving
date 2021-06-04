# https://leetcode.com/explore/challenge/card/june-leetcoding-challenge-2021/603/week-1-june-1st-june-7th/3765/
# <<INCORRECT>>

def isInterleave(s1, s2, s3):
    s1Ptr = 0
    s3Ptr = 0
    res = ''
    while s1Ptr<len(s1) and s3Ptr<len(s3):
        if s1[s1Ptr] == s3[s3Ptr]:
            s1Ptr += 1
        else:
            res += s3[s3Ptr]
        s3Ptr += 1

    print(s1Ptr)
    print(res)

    if s1Ptr!=len(s1) or res!=s2:
        return False
    else:
        return True

print(isInterleave("aabcc", "dbbca", "aadbbcbcac"))