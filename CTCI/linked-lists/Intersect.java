/* Problem: Intersection: Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node. Note that the intersection is defined based on reference, not value. That is, if the kth
node of the first linked list is the exact same node (by reference) as the jth node of the second
linked list, then they are intersecting.
Hints: #20, #45, #55, #65, #76, #93, #111,  */

// Approach: 1) The simplest way is to compare each node of first linked List with other's; O(A*B) time O(1) space.

// The above one was taking most of time for searching, it can be reduced by using hash map
// So 2) Push each nodes of the first LL in HashMap and then search each node of second LL in the HashMap
// if any found then there is an intersection time O(max(A,B)) space O(N)

// Now looking at the fact that if there is an intersection between two LL's then they must end at a single node;
// So 2 cases: (BEST)
    // a) if we have a pointer/reference to tail node, we can simply check only the last node. if it is common then,
    // there is an intersection; time O(1) space O(1);
    // b) if we don't have tail pointer we can simply reach out to tail of each LL and compare O(A+B) time;

// edit: I din't read the problem carefully that we have to find the intersecting node too, So, adding to 3rd approach if found:
// update: Now we have to find out the size of both the LLs and then start comparing linearly untill a match is found


// i'll try implementing the second approach here, cos you know 3rd is just 2 lines :D
import java.util.HashSet;
public class Intersect{

    public static boolean isIntersection(LinkedList lLst1, LinkedList lLst2){
        HashSet<LinkedList.Node> hSet = new HashSet<LinkedList.Node>();
        LinkedList.Node n1 = lLst1.head;
        while(n1 != null){
            hSet.add(n1);
            n1 = n1.next;
        }
        LinkedList.Node  n2 = lLst2.head;
        while(n2 != null){
            if (hSet.contains(n2)) return true;
            n2 = n2.next;
        }
        return false;
    }

    public static void main(String[] args){
        LinkedList lLst1 = new LinkedList();
        lLst1.addLast(14);
        lLst1.addLast(128);
        lLst1.addLast(600);
        LinkedList lLst2 = new LinkedList();
        lLst2.addLast(14);
        lLst2.addLast(128);
        lLst2.addLast(600);
        // here taking example of non intersecting LL
        System.out.println(isIntersection(lLst1, lLst2));
    }
}