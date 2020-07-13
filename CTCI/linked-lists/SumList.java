/*Sum Lists: You have two numbers represented by a linked list, where each node contains a single
digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
function that adds the two numbers and returns the sum as a linked list.*/

// Approach: The simplest way is to convert it into an integer and then add them and finally convert to LL
// other way is that we take the llst, the least significant bit will be at the head.
// now for every elements in each LL, add them and keep remainder in flag to use on next one; O(max(m,n)) time; space O(max(m,n))

// recursive solution pending!!! Gotta learn more of it

public class SumList{

    public static LinkedList sumList(LinkedList first, LinkedList second){
        LinkedList result = new LinkedList();
        LinkedList.Node l1 = first.head;
        LinkedList.Node l2 = second.head;
        int flag = 0;
        int sum = 0;
        while(l1!=null && l2!=null){
            sum = l1.value + l2.value + flag;
            result.addLast(sum%10);
            flag = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            sum = l1.value + flag;
            result.addLast(sum%10);
            flag = sum / 10;
            l1 = l1.next;            
        }
        while(l2!=null){
            sum = l2.value + flag;
            result.addLast(sum%10);
            flag = sum / 10;
            l2 = l2.next;            
        }        
        if(flag!=0) result.addLast(1);
        return result;
    }

    public static void main(String[] args){
        LinkedList first = new LinkedList();
        first.addLast(2);
        first.addLast(9);
        first.addLast(1);
        LinkedList second = new LinkedList();
        second.addLast(8);
        second.addLast(6);
        second.addLast(1);
        LinkedList result = sumList(first, second);
        first.showElements();
        second.showElements();
        result.showElements();
    }
}