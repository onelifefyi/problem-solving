//problem: https://codeforces.com/problemset/problem/384/A

import java.util.Scanner;
public class NCoder{

    public static void printer(int line, int total){
        if(line % 2 == 0){
            System.out.print(".");
            for(int i=0; i<total/2; i++)
            {
                System.out.print("C.");
            }
        }
        else{
            for(int j=0; j<total/2;j++){
                System.out.print("C.");
            }
            System.out.print("C");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        for(int i=0; i<n; i++){
            NCoder.printer(i, n);
        }
    }
}