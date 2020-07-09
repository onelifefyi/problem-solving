/* Problem: Implement an algorithm to delete a node in the middle (i.e., any node but
the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
that node */

// Note: we don't even have access to head, I should have read the question carefully.

// Approach: Since we have singly linked list we cant access the previos node's next!
//           One way would be to copy the next element in place of current node, hence preserving previous node's,
//           next pointer and the deleting the next node;             

public class DeleteMiddle{                          // time/space O(1)
    public static void removeEle(Node toDelete){
        toDelete.value = toDelete.next.value;
        toDelete.next = toDelete.next.next;
    }

    public static void main(String[] args){
        LinkedList<Integer> lLst = new LinkedList<Integer>();
        lLst.add(75);
        Node n = new Node(14);
        lLst.add(n);
        lLst.add(75);
        lLst.add(2019);
        lLst.add(-1);
        removeEle(n);
    }
}