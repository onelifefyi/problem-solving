//problem: https://codeforces.com/problemset/problem/893/A

import java.util.Scanner;

public class Chess3{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = Integer.parseInt(sObj.nextLine());
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        int spect = 3;
        int temp = 0;
        for(int i=0; i<nos; i++){
            temp = sObj.nextInt();
            if(temp == arr[0]){
                arr[1] += spect;
                spect =  arr[1] - spect;
                arr[1] -= spect;
                continue;
            }
            else if(temp == arr[1]){
                arr[0] += spect;
                spect =  arr[0] - spect;
                arr[0] -= spect;
                continue;
            }
            else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}