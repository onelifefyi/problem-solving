//problem: check if two collection have a common attribute or not

import java.util.Arrays;
import java.util.HashSet;
public class Common{
    public static void main(String[] args){
        char[] arr1 = {'a', 'e', 'i', 'o', 'u'};
        char[] arr2 = {'p', 't', 'k', 'a', 'p'};

        //case I: iterate through one array for each element in other array: O(n*m)
        //case II: Sort both the array (ASCII), then start with start of each element and then keep 
                    //incrementing till a match is found or array ends: O(nlogn + mlogn + n + m) == O(nlogn + mlogm) sorting + linear check.

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // int point1 = 0;
        // int point2 = 0;
        // while(point1 < arr1.length && point2 < arr2.length){
        //     if(arr1[point1] == arr2[point2]){
        //         System.out.println("True");
        //         return;
        //     }
        //     else if(arr1[point1] > arr2[point2]){
        //         point2++;
        //     }
        //     else{
        //         point1++;
        //     }
        // }
        // System.out.println("False");

        //case III: push the elements in hash set and then just do a lookup for elements of next collection
                    // O(n + m)

        HashSet<Character> hSet = new HashSet<Character>();
        for(char ch: arr1){
            hSet.add(ch);
        }
        for(char ch2: arr2){
            if(hSet.contains(ch2)){
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }
}