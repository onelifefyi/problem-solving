//problem: https://codeforces.com/problemset/problem/967/B

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Water{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        float[] arr = new float[n-1];
        float poured = sObj.nextFloat();
        float required = sObj.nextFloat();
        float first = sObj.nextFloat(); // skipping first hole;
        float total = first;
        for(int i=0; i<n-1; i++){
            arr[i] = sObj.nextFloat();
            total += arr[i];
        }
        Arrays.sort(arr);
        int counter = 0;
        int lasthole = n-2;
        //System.out.println("current: " + (poured*first/total) + " required: " + required);
        while(poured*first/total < required){
            //System.out.println("current: " + (poured*first/total) + " required: " + required);
            total -= arr[lasthole];
            counter++;
            lasthole--;
        }
        System.out.println(counter);
    }
}