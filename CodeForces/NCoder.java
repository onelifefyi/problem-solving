//problem: https://codeforces.com/problemset/problem/384/A

import java.util.Scanner;
public class NCoder{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        for(int i=0; i<n; i++){
            if(i%2 != 0 && n%2!=0){
                System.out.print(".");
            }
            for(int j=0; j<n/2; j++){
                System.out.print("C.");
            }
            if(i%2 == 0 && n%2!=0){
                System.out.print("C");
            }
            System.out.println();
        }
    }
}