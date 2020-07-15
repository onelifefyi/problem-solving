/* Problem:  Given a circular linked list, implement an algorithm that returns the node at the
beginning of the loop.
DEFINITION
Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so
as to make a loop in the linked list.  */

// Approach: The simplest way is to take an hash set and push the nodes as we move forward, if repeatition 
// found then declare the start of the loop time O(N) space O(N)

// Now a super cool way (Approach from the book) doesn't take any extra space:
// two steps: 1) Check if loop exists (The supercool part)
//            2) Find loop position (Gotta understand this!!!!! IDK yet)

// For step 1 we take two pointers 1st slow (1step at a time) and 2nd fast (2steps at at time),
// now we start both the pointers to traverse the LL, they are eventually going to meet;
// cool stuff: The fast one can never hop the slow one since the slow one is also moving 1 step at a time,
// it is impossible to hop over it if fast once is hopping only 2 steps (Takes some imagination, but worth it)

// F-> Fast; S-> Slow

//            F     S
// eg:        *_*_*_*_*_*_*_*_*_

// next step      F   S
//            *_*_*_*_*_*_*_*_*_
//  
// next step          F S
//            *_*_*_*_*_*_*_*_*_

//                       F
// next step             S
//            *_*_*_*_*_*_*_*_*_        <Collide>