/*
Problem: https://www.geeksforgeeks.org/longest-mountain-subarray/

Approach:
> First iterate through the array to find all the peaks, then for each peak,
  find the peak length. 
  O(n) time and O(n) space

> This is optimisation of above approach, iterate through the array to find a peak, 
  everytime a peak is found try to find the length of peak and compare it with max peak.
  O(n) time, O(1) space
  
I made some mistakes in while conditions, had to fix those
*/

import java.util.ArrayList;
public class LongestPeak{

    public static int getPeak(int[] input){
        ArrayList<Integer> allPeakIndex = new ArrayList<Integer>();
        int maxPeak = 0;
        for(int i=1; i<input.length-1; i++){
            if(input[i-1]<input[i] && input[i+1]<input[i]){
                int peakIndex = i;
                int currentPeakLength = 1;

                int leftIndex=peakIndex-1;
                while(leftIndex >=0 && input[leftIndex]<input[leftIndex+1]){
                    currentPeakLength++;
                    leftIndex--;
                }

                int rightIndex=peakIndex+1;
                while(rightIndex<input.length && input[rightIndex]<input[rightIndex-1]){
                    currentPeakLength++;
                    rightIndex++;
                }
                i = rightIndex;

                if(currentPeakLength > maxPeak) maxPeak = currentPeakLength;
            }
        }
        return maxPeak;
    }

    public static void main(String[] args){
        int[] input = {1, 3, 1, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5};
        System.out.println(getPeak(input));
    }
}