/*
First try to solve Stock Trade II
Kinda my first big problem 
:incorrect: not correct local minima and maxima
*/
//import java.util.Scanner;
import java.util.ArrayList;
public class StockTrade{
    public static int[] trimFind(int[] arr){
        int result[] = new int[2];
        int min, max;
        min = max = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                max = i;
                break;
            }
            max = arr.length;
        }
        for(int i=arr.length-1; i>0; i--){
            if(arr[i] > arr[i-1]){
                min = i;
                break;
            }
            min = 0;
        }
        result[0] = max;
        result[1] = min;
        return result;
    }

    public static void main(String[] args){
        //Scanner sObj = new Scanner(System.in);
        int[] arr = {5,5,4,9,3,8,5,5,1,6,8,3,4};
        int[] limits = StockTrade.trimFind(arr);
        //System.out.printf("lowerVal: %d; upperVal: %d\n", arr[limits[0]], arr[limits[1]]);

        ArrayList<Integer> maxList = new ArrayList<Integer>();
        ArrayList<Integer> minList = new ArrayList<Integer>();

        if(limits[0]>=limits[1]){
            System.out.println("profit: " + 0);
            return;
        }

        minList.add(arr[limits[0]]);

        for(int i=limits[0]+1; i<limits[1]; i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            System.out.printf("prev: %d; current: %d; next: %d\n", i-1, i, i+1);
            if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                System.out.println("added min:" + arr[i]);
                minList.add(arr[i]);
            }
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println("added max:" + arr[i]);
                    maxList.add(arr[i]);
                }
        }
        maxList.add(arr[limits[1]]);
        System.out.print("minList: " + minList + " ");
        System.out.print("maxList: " + maxList);

        int profit = 0;
        int cost = 0;
        for(int ele: maxList){
            profit += ele;
        }
        for(int ele: minList){
            cost += ele;
        }
        System.out.println("Profit: " + (profit - cost));
    }
}