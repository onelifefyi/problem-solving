// problem: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
// Approach: + First I tried to rearrange the array everytime a duplicate is found O(N^2) (stupid me)
//           + Current approach using two pointers, everytime a unique element is found put it in that array O(N)

import java.util.Scanner;
public class RemoveDuplicate {

    public static void getUnique(int[] arr){
        int currentVal = arr[0];
        int currentPos = 1;
        for(int i=1; i<arr.length; i++){
            if(currentVal != arr[i]){
                currentVal = arr[i];
                arr[currentPos] = arr[i];
                currentPos++;
            }
        }
        //System.out.println("Length: " + currentPos);
        for(int j=0; j<currentPos; j++) System.out.print(arr[j] + " ");
    }

    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int[] arr = {0,0,1,1,1,2,2,2,6,6,6,6};
        getUnique(arr);
        sObj.close();
    }
}
