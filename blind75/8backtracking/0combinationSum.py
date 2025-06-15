# https://leetcode.com/problems/combination-sum/

# Approach:
# We can use decision tree
# Where we will have two recursive calls to find all combinations
# First, include the current number, and in the second one don't include the current number

# Man, this is difficult, need to revisit

def combinationSum(candidates, target):
    result = []
    def dfs(i, curr, total):
        if total == target:
            result.append(curr.copy())
            return
        if total > target or i >= len(candidates): return
        curr.append(candidates[i])
        dfs(i, curr, total + candidates[i])
        curr.pop()
        dfs(i + 1, curr, total)
    dfs(0, [], 0)
    return result


candidates = [2,3,6,7]
target = 7
print(combinationSum(candidates, target))
