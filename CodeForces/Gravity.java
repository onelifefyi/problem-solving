//problem: https://codeforces.com/problemset/problem/405/A
import java.util.Scanner;
import java.util.Arrays;

public class Gravity{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int size = sObj.nextInt();
        int[] arr = new int[size];
        int i=0;
        while(size-- != 0){
            arr[i++] = sObj.nextInt();
        }
        Arrays.sort(arr);
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}