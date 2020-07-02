// link: https://practice.geeksforgeeks.org/problems/stock-span-problem/0
// problem: The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate the span of stock’s price for all n days. ..

// approach 1) start from end and for each element traverse the entire array before that element to 
//              count the  #lower terms before we get a higher number: O(N^2)
// there is another cool stack method O(N), but I didn't understood the hint

import java.util.Scanner;
public class Stock{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int days = sObj.nextInt();
        int[] input = new int[days];
        for(int i=0; i<days; i++){
            input[i] = sObj.nextInt();
        }
        int[] sol = new int[days];
    }
}