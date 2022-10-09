# EPI page 34

# We have a function that generate random bits, and we need to implement random
# integer generator between range X & Y (inclusive)

# It's easy to produce random number between 0 and (2^n)-1, since the max possible
# is all bits one, that results in [0,1], [0,3], [0,7], [0,15] for 1, 2, 3 & 4 bits respectively
# And, finding a random number between a, b (inclusive) is equivalent to finding a
# random number between 0 & b-a, since we can just add a to the number to bring it in range

# Now, if the range isn't in the form (2^n)-1 then find the smallest number greater than b-a
# that is of the form (2^n)-1, we try with n bits, if it's in range good, otherwise discard 
# and try again

def uniform_random(lower_bound, upper_bound):
    number_of_outcomes = upper_bound - lower_bound + 1
    # Keep looping till we find the result
    while True
        result, no_bits = 0, 0
        # Checking that the total no of bits must remain within bound to represent max outcome
        while (1<<no_bits) < number_of_outcomes:
            # note that zero_one_random() is given function, that returns 0 or 1 randomly
            result = result << 1 | zero_one_random()
            no_bits += 1
        # if result is within range, get out of loop
        if result < number_of_outcomes:
            break
    # Bringing it back to original range by adding lower bound to result
    return result + lower_bound