# Problem: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
def kidsWithCandies(candies, extraCandies):
    max = 0
    for n in range(0, len(candies)):
        if max < candies[n]:
            max = candies[n]
        candies[n] += extraCandies
            
    lst = []
    for cnd in candies:
        if cnd >= max:
            lst.append(True)
        else:
            lst.append(False)
    
    return lst
    
print(kidsWithCandies([2,3,5,1,3], 3))