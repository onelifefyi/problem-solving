//problem: https://codeforces.com/problemset/problem/984/A
import java.util.Scanner;
import java.util.Arrays;

public class Game{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sObj.nextInt();
        }
        Arrays.sort(arr);
        if(n%2 == 0){
            System.out.println(arr[n/2 - 1]);
        }
        else{
            System.out.println(arr[n/2]);
        }
    }
}