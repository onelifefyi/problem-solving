# https://leetcode.com/problems/count-items-matching-a-rule/

def countMatches(items, ruleKey, ruleValue):
    check = -1
    if ruleKey == "type":
        check = 0
    elif ruleKey == "color":
        check = 1
    else:
        check = 2
        
    count = 0
    for item in items:
        if item[check] == ruleValue:
            count += 1
            
    return count

ruleKey = "color"
ruleValue = "silver"
items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]]
print(countMatches(items, ruleKey, ruleValue))