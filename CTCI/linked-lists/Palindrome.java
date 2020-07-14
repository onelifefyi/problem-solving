/* Problem: Palindrome: Implement a function to check if a linked list is a palindrome.  */
// Approach: The most simple way would be to take another linkedlist/stack, and keep pushing 
// element from first LL to the stack; finally pop and compare it to orignal if no match found return false
// time O(N) spacke O(N)
public class Palindrome{
    public static boolean isPali(LinkedList lLst){
        LinkedList revLst = new LinkedList();
        LinkedList.Node n = lLst.head;
        while(n!=null){
            revLst.addFirst(n.value);
            n = n.next;
        }
        n = lLst.head;
        LinkedList.Node rn = revLst.head;
        while(n!=null){
            if(n.value != rn.value) return false;
            n = n.next;
            rn = rn.next;
        }
        return true;
    }

    public static void main(String[] args){
        LinkedList lLst = new LinkedList();
        lLst.addLast(1);
        lLst.addLast(2);
        lLst.addLast(6);
        lLst.addLast(2);
        lLst.addLast(1);
        System.out.println(isPali(lLst));
    }
}