//problem: https://codeforces.com/problemset/problem/1366/A

import java.util.Scanner;
import java.lang.Math;

public class MineCraft{

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cases = sObj.nextInt();
        for(int z=0; z<cases; z++){
            int dia = sObj.nextInt();
            int stk = sObj.nextInt();
            int emrld = 0;
            while(dia > 0 && stk > 0){
                if(dia >= stk){
                    dia -= 2;
                    stk -= 1;
                    emrld++;
                }
                else{
                    dia -= 1;
                    stk -= 2;
                    emrld++;
                }
            }
            if(dia < 0 || stk < 0){
                emrld--;
            }
            System.out.println(emrld);
        }
    }
}