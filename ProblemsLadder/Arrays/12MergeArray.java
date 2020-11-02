/*
Problem: https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1

Approach:
>    Simplest way that I can think of is to first create a new array of size n1 + n2, now insert all the elements from each array and then sort it,
     finally iterate through the new array and insert in given array
     time O((n+m)log(n+m)) | auxilary space O(n+m)

>    The algo above can be improved by isntead of sorting we use 2 pointer approach

>    Now if we want to merge without using extra space, we compare the first element of each array, if element of first array is greater than element of second array,
     we swap them and then sort the second array. We do this for every element of first array
     time O(m*n) | auxilary space O(1)

*/

import java.util.Arrays;
class MergeArray{
    static int[] arr1 = {1, 3, 5, 7};
    static int[] arr2 = {0, 2, 6, 8, 9};

    public static void merge(int[] arr1, int[] arr2){
// 	int ptr2=0;
	int temp=0;
   	for(int i=0; i<arr1.length; i++){
		if(arr1[i] > arr2[0]){
			temp = arr1[i];
			arr1[i] = arr2[0];
			arr2[0] = temp;
			int ptr=0;
			while(arr2[ptr+1] < temp && ptr<arr2.length-1){
				arr2[ptr] = arr2[ptr+1];
				ptr++;
			}
			arr2[ptr] = temp;
		}
	}
          
    }

    public static void main(String[] args){
    	MergeArray.merge(arr1, arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
    }
}
