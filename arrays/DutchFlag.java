// Incorrect!!!!!!
// Fixed now, note don't append mid while swapping 2

// Sort the given array consisting of only 3 types of items (0, 1 and 2)
// Approac: O(n) 

import java.util.Arrays;
public class DutchFlag{
    public static void main(String[] args){
        int arr[] = {0,0,1,2,1,1,2,2};
        int low,mid,high;
        low = mid = 0;
        high = arr.length - 1;
        while(mid < high){
            if(arr[mid] == 0){
                //System.out.println("Swapping " + arr[mid] + " and " + arr[low]);
                arr[mid] = arr[low];
                arr[low] = 0;
                low++;
                mid++;
            }
            else if(arr[mid] == 2){
                //System.out.println("Swapping " + arr[mid] + " and " + arr[high]);
                arr[mid] = arr[high];
                arr[high] = 2;
                high--;
            }
            else mid++;
        }
        System.out.println(Arrays.toString(arr));
    }
}