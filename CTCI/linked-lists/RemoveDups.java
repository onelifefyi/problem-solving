/* Problem: Write code to remove duplicates from an unsorted linked list.  */

// Approach 1) Brute: for every element in linked list iterate through the ll left
        //     and delete when duplicate is encountered;    time O(N^2) <without extra space>

        //  2) The thing taking most time is scanning through the entire list looking for 
        //  an element, we can store the element list in HashSet to have collection of unique 
        //  elements with fast lookup;    time O(N)        <Extra space needed>

import java.util.LinkedList;
import java.util.HashSet;
public class RemoveDups{
    public static void main(String[] args){
        LinkedList<Integer> lLst = new LinkedList<Integer>();
        HashSet<Integer> hSet = new HashSet<Integer>();
        lLst.add(14);
        lLst.add(61);
        lLst.add(61);
        lLst.add(75);
        lLst.add(75);
        lLst.add(75);
        lLst.add(14);
        for(int i=0; i<lLst.size(); i++){
            if(hSet.contains(lLst.get(i))){
                lLst.remove(i);
                i--;
            }
            else hSet.add(lLst.get(i));
        }
        System.out.println(lLst);
    }
}