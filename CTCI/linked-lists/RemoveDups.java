/* Problem: Write code to remove duplicates from an unsorted linked list.  */

// Approach 1) Brute: for every element in linked list iterate through the ll left
        //     and delete when duplicate is encountered;    time O(N^2) <without extra space>

        //  2) The thing taking most time is scanning through the entire list looking for 
        //  an element, we can store the element list in HashSet to have collection of unique 
        //  elements with fast lookup;    time O(N)        <Extra space needed>

//import java.util.LinkedList;
import java.util.HashSet;
public class RemoveDups{
    public static void main(String[] args){
        LinkedList lLst = new LinkedList();
        HashSet<Integer> hSet = new HashSet<Integer>();
        lLst.addLast(14);
        lLst.addLast(61);
        lLst.addLast(61);
        lLst.addLast(75);
        lLst.addLast(75);
        lLst.addLast(75);
        lLst.addLast(14);
        lLst.showElements();
        for(int i=0; i<lLst.size(); i++){
            if(hSet.contains(lLst.valueAt(i))){
                lLst.deleteFrom(i);
                i--;
            }
            else hSet.add(lLst.valueAt(i));
        }
        lLst.showElements();
    }
}