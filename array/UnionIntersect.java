// Problem: Program to find union and intersection between two array

/*
Approach: Union put all in hashset time O(m+n) space O(1)
          Intersection: (here sorted) use hashset for 1st array and on 2nd array whenever already present in set print it. O(n+m)
*/

import java.util.Arrays;
import java.util.HashSet;
public class UnionIntersect{

    public static void getUnion(int arr1[], int[] arr2){
        HashSet<Integer> hSet = new HashSet<Integer>();
        for(int ele1: arr1) hSet.add(ele1);
        for(int ele2: arr2) hSet.add(ele2);
        System.out.println(hSet.toString());
    }

    public static void getIntersection(int arr1[], int[] arr2){
        Arrays.sort(arr1); Arrays.sort(arr2);
        int p1 = 0;
        int p2 = 0;
        while(p1 < arr1.length && p2 < arr2.length){
            if(arr1[p1] == arr2[p2]){
                System.out.print(arr1[p1] + " ");
                p1++; p2++;
            }
            else if(arr1[p1] < arr2[p2]) p1++;
            else p2++; 
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 4, 125, 325, 61, 5, 235};
        int arr2[] = {14, 124, 235, 345, 4, 5435};
        getUnion(arr1, arr2);
        getIntersection(arr1, arr2);
    }
}