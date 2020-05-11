//problem: https://codeforces.com/problemset/problem/1236/A

import java.util.Scanner;
//import java.util.Arrays;
public class Stones{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cases = Integer.parseInt(sObj.nextLine());
        int[] arr = new int[3];
        int total = 0;
        for(int i=0; i<cases; i++){
            total = 0;
            arr[0] = sObj.nextInt();
            arr[1] = sObj.nextInt();
            arr[2] = sObj.nextInt();
            //Arrays.sort(arr);
            while(arr[2] >= 2 && arr[1] >= 1){
                total += 3;
                arr[2] -= 2;
                arr[1] -= 1;
            }
            while(arr[1] >= 2 && arr[0] >= 1){
                total += 3;
                arr[1] -= 2;
                arr[0] -= 1;
            }
            System.out.println(total);
        }
    }
}