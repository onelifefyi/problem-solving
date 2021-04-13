# https://codeforces.com/problemset/problem/218/B
# Time O(nlogn) | Aux space O(seats)

passengers, planes = [int(num) for num in input().split()]
seats = [int(seat) for seat in input().split()]
minSeats = sorted(seats)

minCost = 0
minPos = 0
minPas = passengers
while(minPas>0):
    if(minSeats[minPos] == 0):
        minPos += 1
    minCost += minSeats[minPos]
    minSeats[minPos] -= 1
    minPas -= 1

maxCost = 0
maxPos = 0
maxPas = passengers
while(maxPas>0):
    maxPos = seats.index(max(seats))
    maxCost += seats[maxPos]
    seats[maxPos] -= 1
    maxPas -= 1

print(maxCost, minCost)