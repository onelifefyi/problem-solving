/*
Problem: https://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/

Approach:

1) Union
>   Simplest way is to create a hashset and push all the elements of both the arrays in that hashset
    time O(n+m) | auxilary space O(n+m)

>   Take two pointer i,j starting at 0; compare elements at index and if arr1[i] > arr2[j] then print arr2[j] and j++ and vice versa;
    Now if both are equal print one of them and increment both i and j. Finally print all the remaining elements.
    time O(n+m) | auxilary space O(1)

2) Intersection:
>   Take hash set and put all the elements of one array in it, now iterate through the second array elements 
    and print if found in hashset.
    time O(n + m) | auxilary space O(min(n,m))

>   Similar to union's second approach take two pointers and increment in similar way only printing if both equal.
    time O(n+m) | auxilary space O(1)

*/

class UnionIntersection{

    public static void getIntersection(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        while(i < arr1.length && j <arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i] + " ");
                i++; 
                j++;
            }
            else if(arr1[i] < arr2[j]) i++;
            else j++;
        }
        System.out.println();
    }

    public static void getUnion(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        while(i < arr1.length && j <arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i] + " ");
                i++; 
                j++;
            }
            else if(arr1[i] < arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            }
            else {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
        while(i < arr1.length) System.out.print(arr1[i++] + " ");
        while(j < arr2.length) System.out.print(arr2[j++] + " ");
        System.out.println();
    
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,12,61,75,321};
        int[] arr2 = {1,2,14,75,444};
        
        getIntersection(arr1, arr2);
        getUnion(arr1, arr2);
    }
}