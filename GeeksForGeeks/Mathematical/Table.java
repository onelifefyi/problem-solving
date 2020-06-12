//problem: https://practice.geeksforgeeks.org/problems/print-table/0

import java.util.Scanner;
public class Table{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int cases = sObj.nextInt();
        for(int z=0; z<cases; z++){
            int n = sObj.nextInt();
            for(int i=1; i<=10; i++){
                out.append((n * i) + " ");
            }
            out.append("\n");
        }
        System.out.print(out);
    }
}