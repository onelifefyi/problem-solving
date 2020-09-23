// Problem: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
/* Approach:
 * The simplest way would be to iterate through one array for each element in other array and mark the element as -ve if match found
   This works only if all elements are positive and time O(n*m)
 * One other way is if we can sort the array then have a sweep for each elements time: O(nlogn + mlogm) to sort + O(n+m) to sweep. Hence O(max(nlogn,mlogm))
 * Another way is if we put the elements of one array in hash map as key and occurances as value, then for each element in other arary check if it is present
   This will take O(n+m) time and O(min(n,m)) space
 */

import java.util.Scanner;
import java.util.HashMap;
public class Intersection {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int m = sObj.nextInt(); 
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        int temp;
        for(int i=0; i<n; i++){
            temp = sObj.nextInt();
            if(freq.containsKey(temp)) freq.put(temp, freq.get(temp)+1);
            else freq.put(temp, 1);
        }
        int temp2;
        for(int j=0; j<m; j++){
            temp2 = sObj.nextInt();
            if(freq.containsKey(temp2) && freq.get(temp2)>=1){
                System.out.print(temp2 + " ");
                freq.put(temp2, freq.get(temp2)-1);
            }
        }
        sObj.close();
    }
}
