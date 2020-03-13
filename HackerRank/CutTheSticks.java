import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int sticksCount(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                count++;
            }
        }
        return count;
    }

    static int findLargest(int[] arr){
        int large = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        return large;
    }

    static int findSmallest(int[] arr){
        int small = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
                if(arr[i]<1){
                    continue;
                }
                small = arr[i];
            }
        }
        return small;
    }

    static int countSticks(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                count++;
            }
        }
            return count;
    }

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        //System.out.print(countSticks(arr));
        //System.out.print(findSmallest(arr));
        //System.out.print(findLargest(arr));
        //System.out.print(sticksCount(arr));
        int[] result = new int[arr.slength];
        int iteration = 0;
        int min, max;
        while(sticksCount(arr)>0){
            //System.out.println(sticksCount(arr));
            //System.out.println("Sticks Left: " + sticksCount(arr));
            result[iteration] = sticksCount(arr);
            min = findSmallest(arr);
            //System.out.println("Min: " + findSmallest(arr));
            //max = findLargest(arr);
            //System.out.println("Sticks Left: " + sticksCount(arr));
            for(int i=0; i<arr.length; i++){
                arr[i] = arr[i] - min;
            }
            iteration++;
            if(findSmallest(arr)==findLargest(arr)){
                //System.out.println(sticksCount(arr));
                result[iteration] = sticksCount(arr);
                break;
            }
        }
        int[] arrayResult = new int[countSticks(result)];
        for(int i=0; i<arrayResult.length; i++){
            arrayResult[i] = result[i];
        }
        return arrayResult;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}