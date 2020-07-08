/*problem: 2.2 Implement an algorithm to find the kth to last element of a singly linked list.  */

// Approach:
// The simplest way is to iterate through the array to find the number of elements,
// and then subtract k from size of linked list(n) this'll take O(N + N) = O(N) time

// Other way would be to jump the pointer by 2 in each iteration, that way we'll be able to 
// find the last element faster O(N/2 + N) = O(N) time a bit more efficient (This doesn't make any
// sence, IDK why did I come up with this)

// There is one recursive solution where we call till null then keep on returning w/ counter
// counting from zero; one problem is how do we return the solution!! (We can use class maybe)

// Okay finally the coolest solution is to take two pointers k distance apart; So when the 2nd 
// counter reaches last element, we've found Kth element from the last; O(N) time!!
// Implemented below: Note that it doesn't run/ cos we need to have our own LL

import java.util.LinkedList;
import java.util.Arrays;
public class KthLast{
    public static int findKth(LinkedList<Integer> lLst, int k){
        LinkedList node1 = head;
        LinkedList node2 = head;
        for(int i=0; i<k; i++){
            node1 = node1.next;
        }

        while(node2 != null){
            node1 = node1.next;
            node2 = node2.next;
        }
    }

    public static void main(String[] args){
        int[] arr = {24,12,21,415,61,75,14};
        LinkedList<Integer> lLst = new LinkedList<Integer>();
        for(int ele: arr){
            lLst.add(ele);
        }
        System.out.println(lLst);
        System.out.println(findKth(lLst, 3));
    }
}




