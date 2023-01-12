cases = int(input())

for case in range(cases):
    apartment = input()
    num_digits = len(apartment)
    apartment = int(apartment)
    
    prev_keypresses = 0

    # Find keypresses before the digit
    digit = apartment % 10
    prev_keypresses += (digit-1) * 10

    # Find kepresses for the current digit
    current_floor_keypresses = 0
    for i in range(1, num_digits+1):
        current_floor_keypresses += i
    
    print(prev_keypresses + current_floor_keypresses)