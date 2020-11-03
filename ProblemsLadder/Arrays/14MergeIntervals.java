/*
Problem: 
Given a collection of intervals, merge all overlapping intervals.

Approach:
>   First sort the array based on the first column. Now we are sure that if intervals 
    are to be merged, they are going to be side by side. Now we traverse the array for 
    each sub array we compare it with the next one. if it can be merged we merge it 
    else we push it to result arraylist
    time O(nlogn) + O(n) | auxilary space O(1)

*/

import java.util.Arrays;
import java.util.ArrayList;
class MergeIntervals{

    public static ArrayList<int[]> mergeInterval(int[][] input){
        ArrayList<int[]> result = new ArrayList<int[]>();
        int[] temp = input[0];
        for(int[] current: input){
            if(current[0] <= temp[1]) temp[1] = Math.max(temp[1], current[1]);
            else{
                result.add(temp);
                temp = current;
            }
        }
        result.add(temp);
        return result;
    }

    public static void main(String[] args){
        //int[][] input = {{1,2},{2,3},{1,3}};
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        // Line below is something new, used to sort the 2d input array, lambda function used
        Arrays.sort(input, (a,b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> result = mergeInterval(input);
        for(int[] ele: result) System.out.printf("(%d,%d); ",ele[0], ele[1]);
    }
}