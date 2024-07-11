# https://leetcode.com/problems/find-and-replace-in-string/description/

def findReplaceString(s, indices, sources, targets):
    result = str(s[:])
    shift = 0

    for i, src, tgt in sorted(zip(indices, sources, targets)):
        if s[i:i+len(src)] == src:
            i = i + shift
            result = result[:i] + tgt + result[i+len(src):]
            shift += len(tgt) - len(src)
    return result