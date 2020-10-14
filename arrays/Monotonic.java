/* 
Problem: https://leetcode.com/problems/monotonic-array/
return true when the array is either strictly nondecreasing or nonincreasing

Approach:

> One approach is to keep traversing through the array, if decreasing/increasing value is found,
  then check iff it's only increasing or decreasing, return false if this changes time O(n) space O(1)
  // While the above approach is okayish, it's a bit confusing to implement

> I realised that I was doing extra work, I can simply keep two boolean value isIncereasing and isDecreasing,
  and check it traversing through the array if both are true then array isn't monotonic.
  time O(n) auxilary space O(1)
    
*/

public class Monotonic{

    public static boolean isMonotonic(int[] input){
        boolean isIncreasing = false;
        boolean isDecreasing = false;
        int pointer = 1;
        while(pointer < input.length){
            if(input[pointer-1] < input[pointer]){
                isIncreasing = true;
            }
            else if(input[pointer-1] > input[pointer]){
                isDecreasing = true;
            }
            pointer++;
            if(isIncreasing && isDecreasing ) return false;
        }
        return true;
    }

    public static void main(String[] args){
      //int[] input = {-1,-5,-10,-1100,-1100,-1101,-1102,-9001};    //true
      //int[] input = {-1,-5,-10,-1100,-1100,-1101,-1100,-9001};    //false
        int[] input = {1,3,2};
        boolean result = isMonotonic(input);
        System.out.println(result);
    }
}