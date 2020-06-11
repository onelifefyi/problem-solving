//problem: https://practice.geeksforgeeks.org/problems/print-the-pattern-set-1/1

import java.util.Scanner;
public class puzzle{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int cases = sObj.nextInt();
        for(int z=0; z<cases; z++){
            int n = sObj.nextInt();
            for(int i=0; i<n; i++){
                for(int j=n; j>0; j--){
                    for(int k=n; k>i; k--){
                        out.append(j);
                    }
                }
                out.append('$');
            }
            out.append("\n");
        }
        System.out.println(out);
    }
}