/* Problem: https://leetcode.com/problems/sort-colors/
            - Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
    
    Approach: The simplest approach would be to sort it like any other sorting technique, best merge: O(nlogn) 
    + Now, considering the fact that there are only 3 unique values that can be in the given array, we can perform counting sort!
        - In this we'll iterate through the array counting the # of red(0), white(1) and blue(2) objects and finally filling the array on 2nd pass this'll take O(n) time
        - This approach although having O(n) time, it still takes 2 pass to sort.
    + Now to optimise this to work on 1 pass: There is something called Dutch National Flag Algorithm (specific) using 3 pointers,
        - we take the given array, two pointers pointing to 0th position (named low and mid) and 1 pointer pointing to last position (named high). 
        - we keep moving the mid pointer forward, if we encounter 0 swap it with low and increment low and mid both, if we encounter 2 then swap  mid and high & decrement high.
        - this'll work because we are placing 0 and 2 on each end & all the 1s will come to mid naturally.
 */


import java.util.Arrays;
class ColorSort{

    static int[] sort(int arr[]){           // O(N) two pass (Counting Sort)
        int count[] = new int[3];
        for(int ele: arr){
            if(ele == 0) count[0]++;
            else if(ele == 1) count[1]++;
            else count[2]++;
        }
        int j = 0;
        for(int i=0; i<3; i++){
            while(count[i]-- != 0) arr[j++] = i;
        }
        return arr;
    }

    static int[] sort2(int arr[]){          // O(N) single pass (Dutch National Flag/ 3 pointer approach)
        int low, mid;
        low = mid = 0;
        int high = arr.length-1;
        while(mid <= high){                 // Note: The <='s = is required to make it work for {2, 0, 1}; (b'cos if = not there one element will never be tested)
            if(arr[mid] == 0){
                arr[mid++] = arr[low];
                arr[low++] = 0;
            }
            else if(arr[mid] == 2){
                arr[mid] = arr[high];
                arr[high--] = 2;
            }
            else mid++;
        }
        return arr;
    }

    public static void main(String[] args){
        //int arr[] = {0, 1, 2, 2, 1, 1, 1, 0, 2, 1, 2, 0, 0};
        int arr[] = {2,0,1};
        //arr = sort(arr);
        arr = sort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}