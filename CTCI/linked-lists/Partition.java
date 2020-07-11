/* Problem:  Write code to partition a linked list around a value x, such that all nodes less than x come
before all nodes greater than or equal to x. lf x is contained within the list, the values of x only need
to be after the elements less than x (see below). The partition element x can appear anywhere in the
"right partition"; it does not need to appear between the left and right partitions.  */

//approach: 
/* All the elements less than ( remember not equal) to given element must be in left to all elements greater or equal to 
   given element.
   Atleast we have to visit all the elements once to check if greater or lower;
   I can try traversing the linked list and whenever an element lesser than given element appears delete it and 
   put it as first element time:            O(N) time O(1) space   <Implemented>


    eg 12-2-42-14-24-14-24-5; ele = 24;
    2 on front; 14 on front; 14 on front; 5 on front => 5-14-14-2-12-42-24-24  Got it!

    improvement (minor) we can set a flag for first encounter of an element greater or equal to given threshold and 
    start shifting only when that boolean is true
*/

// Improvement/Alternate: If we want stable solution (i.e, Elements appear in order, then we can use two linkedlists,
// ond traverse through it, putting lesser ele in one LL and greater in 2nd LL finally merging them) This'll increase space O(N)

public class Partition{

    public static void part(LinkedList lLst, int ele){
        Node n = lLst.head.next;
        Node prev = lLst.head;
        int temp;
        while(n.next != null){              
            if(n.value < ele){
                prev.next = n.next;
                n.next = lLst.head;
                lLst.head = n;
            }
        }
    }

    public static void main(String[] args){
        // let LinkedList lLst = 12-2-42-14-24-14-24-5
        part(lLst);
    }
}