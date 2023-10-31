# This is a super interesting problem
# Time O()

def getIntersection(r1, r2):
    if((r1["x"] + r1["width"]) < r2["x"]) or ((r1["y"] + r1["height"]) < r2["y"]):
        return False
    else:
        result = {}
        result["x"] = max(r1["x"], r2["x"])
        result["y"] = max(r1["y"], r2["y"])
        result["width"] = min(r1["x"] + r1["width"], r2["x"] + r2["width"]) - result["x"]
        result["height"] = min(r1["y"] + r1["height"], r2["y"] + r2["height"]) - result["y"]
        return result

r1 = {}
r1["x"] = 0
r1["y"] = 0
r1["width"] = 4 
r1["height"] = 4

r2 = {}
r2["x"] = 3
r2["y"] = 0
r2["width"] = 3 
r2["height"] = 3

print(getIntersection(r1, r2))