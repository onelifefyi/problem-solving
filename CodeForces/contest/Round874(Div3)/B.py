# Getting TLE in case 6
def getTemp(nums, temps):
    sortedNums = sorted(nums)
    sortedTemps = sorted(temps)
    mapNums = {}
    for index, val in enumerate(sortedNums):
        if val in mapNums:
            mapNums[val].append(sortedTemps[index])
        else:
            mapNums[val] = [sortedTemps[index]]
    result = [mapNums[num].pop(0) for num in nums]
    return result

css = int(input())
for i in range(css):
    l, k = [int(num) for num in input().split()]
    nums = [int(num) for num in input().split()]
    temps = [int(num) for num in input().split()]
    rearranged_temps = getTemp(nums, temps)
    print(*rearranged_temps)
