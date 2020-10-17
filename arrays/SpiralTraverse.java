/*
Problem: 
Write a function that takes in an n x m two-dimensional array (that can be square-shaped when n === m)
and returns a one-dimensional array of all the array's elements in spiral order.
Spiral order starts at the top left corner of the two-dimensional array, goes to the right, and proceeds in a
spiral pattern all the way until every element has been visited.

Approach:
> We have to traverse the parameter of the matrix and then keep decreasing the matrix by 1; 
  time O(N) time where N=total no of elements and need to find space!?
  (It took a lot of time to plan algo and implement!!!!!!!)
  this can be done iteratively as well, recurse base condition to while condition switch needed
*/
import java.util.ArrayList;
//import java.util.Arrays;
public class SpiralTraverse{

    public static ArrayList<Integer> getSpiralRecurse(int[][] input, ArrayList<Integer> result, int startCol, int endCol, int startRow, int endRow){
        if(startCol>endCol || startRow>endRow) return result;
        System.out.printf("row: %d col: %d\n", endRow, endCol);
        for(int p=startCol; p<=endCol; p++) result.add(input[startRow][p]);
        for(int q=startRow+1; q<=endRow; q++) result.add(input[q][endCol]);
        for(int r=endCol-1; r>=startCol; r--) result.add(input[endRow][r]);
        for(int s=endRow-1; s>=startRow+1; s--) result.add(input[s][startCol]);
        return getSpiralRecurse(input, result, startCol+1, endCol-1, startRow+1, endRow-1);
    }

    public static ArrayList<Integer> getSpiral(int[][] input){
        ArrayList<Integer> result = new ArrayList<Integer>();
        return getSpiralRecurse(input, result, 0, input[0].length-1, 0, input.length-1);
    }

    public static void main(String[] args){
        int[][] input = {{1,2,3,4},
                         {12,13,14,5},
                         {11,16,15,6},
                         {10,9,8,7}};

        ArrayList<Integer> result = getSpiral(input);
        System.out.println(result);
    }
}